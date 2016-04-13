
TEAM 9

Members :-  Roshni Kailash
            Sneha Ilangovan
            Shubhra Gupta
            Swarna Viswanathan
            Aditya Veda
            
            
Design patterns used

Swarna ­ Command 

Sneha ­ Observer

Roshni ­ Factory / Abstract Factory

Shubhra ­ State pattern

Aditya­  decorator



XP values

Swarna ­ Communication

Sneha ­ Simplicity

Roshni ­ Feedback

Shubhra­ Respect

Aditya­ Courage



## Research on Kinect API and Greenfoot platforms for Game development (Issue 2) #Roshni
There are a number of kinect APIs available for game development in many languages.
The J4K Library created at the University of Florida seems to be a great library available
for use with Java.

Looked at existing sample games developed on Greenfoot from various sources on the internet. 
Game development on greenfoot seems to be very intuitive. It also looks fairly easy to use.

## Research on J4k Library (Issue 5) #Roshni
The J4K library is an open source Java library that is compatible with all kinect devices. 
It implements a Java binding (wrapper) for the Microsoft's Kinect SDK. It can be used to 
create Java applications that use the Kinect sensor. The J4K Library provides various class 
APIs to handle different kinds of interactions with the Kinect. The J4KSDK class for example 
implements a Java binding for the Kinect SDK that handles the video, depth and skeleton streams 
of the kinect using Java Native Interface. The depthmap class converts depth frames from kinect 
sensor into a 3D object. The Skeleton class offers APIs to convert the skeleton data frames 
received by the sensor intoa skeleton object that can be rendered in OpenGL as a stick figure. 
TheVideoframe class offers APIs to convert video frames received by the kinect into an OpenGL texture.  

##Research on Leap API & JavaFX(Issue 11)
The Leap Motion API follows a simple architecture design. It is based on a listener
design pattern where methods are called when certain actions are performed on the Leap Motion
device, similar to mouse listeners. The most important Leap Motion listener method in our
application is the onFrame() method, though there are several other methods provided by the
Leap Listener class. The onFrame() method has access to the current frame application data such
as hand positions, finger positions, and gestures being performed. Leap Motion API has built in
functionality for certain gestures, returning a list of any recognized gestures on a given
onFrame(). The commonly used gestures that Leap supports are swipes, taps, and circle gestures.
This data is then handed off to the JavaFX threads for the interface to “react” to.
Research about Unity Engine and view games developed using Unity game engine for reference purposes.
Unity is a cross-platform engine which can be used to develop games for mobiles, PCs, tablets and more.


###leap-ue4(Swarna)
An event-driven Leap Motion plugin for the Unreal Engine 4.

We can use convenience blueprints to just select and play or use a custom approach via blueprints or C++.
Possible to extend functionality to any blueprint through adding the LeapInterfaceEvent interface then adding the LeapController component to that blueprint. This same architecture is available to C++, which also supports both event-driven and polling style use.

###Research on Unity (Shubhra)
Unity is a great game engine to develop online video games, games for mobile devices and desktop. It targets the APIS on different platforms like Windows, Mac, Android, XBox 360 and help to develop portable games that work pretty well on different platforms. It has features like texture compression, bump-mapping, parallax mapping, dynamic shadows, screen space ambient occlusion, render-to-texture effects that facilitate development of eye-catchy, attractive, complex an luring gaming applications. Unity has great feature for becoming a convenient, powerful, flexible game engine.  

