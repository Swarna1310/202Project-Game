import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/**
 * The basic world class for Kinect scenarios.
 *
 * Rather than use this as-is, you will need to make a sub-class
 * with the behaviour you want (e.g. extra logic in the constructor
 * and the act() method).  When you make a sub-class, don't forget
 * in your act() method to have as the first line: <pre>super.act();</pre>
 * which ensures that KinectWorld does its update before anything else
 * in your scenario happens.
 */
public abstract class KinectWorld extends World
{
    private final KinectClient kinect;
    private final double scale;

    /**
     * Constructs a KinectWorld that is 640 by 480 pixels,
     * with a full-sized thumbnail (RGB) image available, but no depth information.
     *
     * If you need to configure any of these settings, use one of the other constructors.
     */
    public KinectWorld()
    {
        this(1.0, false);
    }

    /**
     * Constructs a KinectWorld that is scaled and may have depth available.
     *
     * The first parameter specifies a scale factor for the world.
     * The Kinect device itself captures an image that is 640 * 480 pixels,
     * and all the joints' screen positions are given in terms of a position
     * in this image.  If you want to display a larger world than 640 * 480 pixels
     * in Greenfoot, you will need to scale up all the information received
     * from the Kinect.  KinectWorld can do this for you, and will scale up
     * the thumbnail image, the user images, and all the joint positions
     * by the given scale.  So if you pass 2.0, the thumbnail image will
     * be 1280 * 960 pixels, if you pass 1.5, it will be 960 * 720, and so on.
     * Note that scaling the images in this way requires a bit of extra processing
     * power, so on less powerful machines you may experience some slowdown
     * if you enable this scaling.
     * 
     * The second parameter is a boolean, stating whether to enable depth
     * information.  This also takes up a bit of extra processing time
     * if you enable it.
     */
    public KinectWorld(double scale, boolean depth)
    {
        this(KinectClient.DEFAULT_IMAGE_WIDTH, KinectClient.DEFAULT_IMAGE_HEIGHT, scale, depth);
    }

    /**
     * Constructor for objects of class KinectWorld.
     * 
     * The first two parameters specify the resolution of the thumbnail (RGB) image
     * taken from the Kinect, and the latter two are the same as in the other constructor.
     *
     * You only need this constructor if you know you only need to use a
     * smaller thumbnail, and you want to save the processor time needed to
     * copy around the larger thumbnail.
     */
    public KinectWorld(int thumbnailWidth, int thumbnailHeight, double scale, boolean depth)
    {
        super((int)(KinectClient.DEFAULT_IMAGE_WIDTH * scale), (int)(KinectClient.DEFAULT_IMAGE_HEIGHT * scale), 1); 

        this.scale = scale;

        kinect = new KinectClient(thumbnailWidth, thumbnailHeight, depth);
    }
    
    /**
     * The world's act method: updates information from the Kinect.
     */    
    public void act()
    {
        if (isConnected())
            kinect.update();
    }
    
    /**
     * Checks whether we are currently connected properly to a functioning KinectServer.
     *
     * To reconnect, the best thing to do is to press Reset in the Greenfoot
     * interface.  If everything is working properly, KinectWorld should
     * connect when it is created, and should not disconnect once connected.
     */
    public boolean isConnected()
    {
        return kinect.isConnected();
    }

    private UserData[] scaleUsers(UserData[] users)
    {
        for (int i = 0; i < users.length; i++)
            users[i] = users[i].scaledCopy((float)scale);
        return users;
    }

    /**
     * Gets all users currently in front of the Kinect.
     *
     * A user is a person that the Kinect has successfully spotted as being human
     * (although sometimes doors, coats, etc can be marked as users, too!)
     * but a user has not necessarily calibrated themselves yet.
     * If you are only interested in calibrated users, see getTrackedUsers.
     *
     * The returned array should never be null, but it may have length
     * zero if there are no users, or if isConnected() is false.
     */
    public UserData[] getAllUsers()
    {
        if (kinect == null)
            return new UserData[0];
        else
            return scaleUsers(kinect.getUsers());
    }
    
    /**
     * Gets only those users who are currently being tracked
     * (i.e. those who have successfully calibrated).
     * 
     * The returned array should never be null, but it may have length
     * zero if there are no users, or if isConnected() is false.
     */
    public UserData[] getTrackedUsers()
    {
        ArrayList<UserData> trackedUsers = new ArrayList<UserData>();
        for (UserData u : getAllUsers())
        {
            if (u.isTracking())
            {
                trackedUsers.add(u);
            }
        }
        // No need to scale, as getAllUsers will have already scaled:
        return trackedUsers.toArray(new UserData[0]);
    }
    
    /**
     * Gets the first user who is being tracked.
     * This is essentially equivalent to picking out the first entry
     * in the getTrackedUsers() array, but is a useful shorthand.
     *
     * If there are no tracked users, or isConnected() is false, this will be null.
     */
    public UserData getTrackedUser()
    {
        // No need to scale, as getAllUsers will have already scaled:
        for (UserData u : getAllUsers())
        {
            if (u.isTracking())
                return u;
        }
        
        return null;
    }
    
    /**
     * Gets the UserData for a user with the specified identifier.
     *
     * This is useful if you have previously picked out
     * a user from the getUsers/getTrackedUsers() function, recorded
     * the identifier, and now want to ask for that user's most recent data.
     *
     * Returns null if a user with that identifier does not exist
     * (this can also happen if the user leaves the scene, i.e. walks
     * away from the Kinect and does not return within a few seconds).
     */
    public UserData getUser(int userId)
    {
        UserData u = kinect.getUser(userId);
        if (u != null)
            u = u.scaledCopy((float)scale);
        return u;
    }
    
    /**
     * Gets the current thumbnail (i.e. the current camera image).
     *
     * This may be null if isConnected() is false.
     */
    public GreenfootImage getThumbnail()
    {
        GreenfootImage img = getThumbnailUnscaled();
        if (img != null)
            img.scale((int)(scale * img.getWidth()), (int)(scale * img.getHeight()));
        return img;
    }

    /**
     * Gets the actual thumbnail, without any scaling applied.
     * This can be useful if you used one of KinectWorld's alternate
     * constructors and you just want a tiny thumbnail that does not
     * need to be scaled up.
     *
     * This may be null if isConnected() is false.
     */
    public GreenfootImage getThumbnailUnscaled()
    {
        if (kinect == null)
            return null;
        else
            return kinect.getThumbnail();
    }
    
    