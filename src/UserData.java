import greenfoot.*;

/**
 * The data for a user (i.e. person in front of the sensor).
 */
public class UserData
{
    private int id; // set by the Kinect software, arbitrary and gets re-used
    private int state; // current state, 0 is not tracking, 1 is calibrating, 2 is tracking
    private int previousState; // state before last data frame from the server.
    private final Joint[] joints = new Joint[Joint.NUM_JOINTS]; // Joint data, only valid when tracking
    private GreenfootImage img; // Scaled image, present in any state, can be arbitrary size
    private int imgX, imgY; // Scaled offset into overall scaled 640*480 image.

    private UserData(UserData ud, float scale)
    {
        this.id = ud.id;
        this.state = ud.state;
        this.previousState = ud.state;
        this.img = new GreenfootImage(ud.img);
        this.img.scale((int)(scale * this.img.getWidth()), (int)(scale * this.img.getHeight()));
        this.imgX = (int)(ud.imgX * scale);
        this.imgY = (int)(ud.imgY * scale);
        for (int i = 0; i < Joint.NUM_JOINTS; i++)
        {
            joints[i] = ud.joints[i].scaledCopy(scale);
        }
    }
    
    /**
     * For internal use only.
     */
    public UserData(int id)
    {
        this.id = id;
        previousState = -1;
    }
    
    /**
     * For internal use only.
     */
    public void setState(int state)
    {
        this.previousState = this.state;
        this.state = state;
    }
    
    /**
     * For internal use only.
     */
    public void setJoint(int j, Joint joint)
    {
        joints[j] = joint;
    }

    /**
     * For internal use only.
     */
    public void setImage(GreenfootImage img, int x, int y)
    {
        this.img = img;
        this.imgX = x;
        this.imgY = y;
    }    
    
    /**
     * Gets the identifer of this user.  This is an arbitrary number.  It is guaranteed
     * to be unique among the current set of users, but if a user leaves the scene,
     * or tracking fails, the identifier may be re-used again in future.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns true if the user is being tracked.
     * 
     * Tracked means that they have been calibrated by the sensor, and we are now receiving
     * updates on the positions of their joints.
     */
    public boolean isTracking()
    {
        return state == 2;
    }
    
    /**
     * Returns true if the user is currently calibrating.
     * 
     * Calibrating means they have assumed the arms-up position, and the sensor is spending a few
     * seconds trying to calibrate.  If this is successful, they will move to the tracking
     * state, after which this method will return false.  If it is eventually unsuccessful they will return
     * to the default state.
     */
    public boolean isCalibrating()
    {
        return state == 1;
    }
    
    /**
     * Returns true if isTracking() currently returns true, but would have returned false before the last
     * update from the server.
     * 
     * This indicates that this frame is the first one in which they are being tracked, having
     * been calibrating during the previous frame.
     */
    public boolean startedTracking()
    {
        return state == 2 && previousState != state;
    }
    
    /**
     * Returns true if isCalibrating() currently returns true, but would have returned false before the last
     * update from the server.
     * 
     * This indicates that this frame is the first one in which they are being calibrated, having
     * been in the default state during the previous frame.
     */
    public boolean startedCalibrating()
    {
        return state == 1 && previousState != state;
    }

    /**
     * Gets the current user outline image.  This will be a cutout of the user,
     * which will be transparent wherever the user is not detected.  So for example,
     * if they stand with their legs apart, it will be transparent between their legs.
     *
     * The image will not (generally) be the same size as the world; it will only
     * be large enough to contain the user's image.  Use getImageX() and getImageY()
     * to find out where the user's image resides in relation to the world as a whole.
     */
    public GreenfootImage getImage()
    {
        return img;
    }
    
    /**
     * The left of the image returned by getImage().
     */
    public int getImageX()
    {
        return imgX;
    }
    
    /**
     * The top of the image returned by getImage().
     */
    public int getImageY()
    {
        return imgY;
    }
    
int data is only valid if isTracking() currently returns true.
     */
    public Joint getJoint(int index)
    {
        return joints[index];
    }
    

    
   }
