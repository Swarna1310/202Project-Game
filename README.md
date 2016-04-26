
TEAM 9

Members :-  Roshni Kailash,
            Sneha Ilangovan,
            Shubhra Gupta,
            Swarna Viswanathan,
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

Aditya Veda­ Courage



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

## Researching on design patterns that can be applied for implementing various features of the game (Roshni, Issue 13)
As per the GoF an Abstract factory pattern provides an interface for creating 
families of related objects without specifying their concrete classes.This has 
great applications in many domains including game design. Let us suppose I am 
creating a game like the famous "Need for speed". The game allows us to select 
various themes for game play. I could for example select a "rainy day" theme 
for one game and select a "sunny day" theme for a different game. To represent a 
"rainy day" I will need a cloudy sky, a wet road and rain drops all over my screen. 
However, to represent a "sunny day" I will need a clear sky, dry road and a clear, bright screen.
The sky, road and screen are a family of related objects that I could bundle together.
So in this game design, I will end up having something like iGameTheme interface. The RainyTheme and SunnyTheme 
classes will implement the iGameTheme interface to create concrete products sky, road and screen.
This way when the concrete factories ("rainy day factory" or "sunny day factory") are passed as parameters to the 
game the corresponding road, sky and screen are generated in the game. This way I can have many more
concrete factories implementing the abstract factory iGameTheme to have numerous themes for the
game each generating a unique road, sky and screen specific to the theme I want.

The Factory method also known as a virtual constructor can be used extensively in game development. It defines an 
interface for creating an object but leaves choice of it's type to the subclasses. For example in a war game we could
have a Enemy Factory class that generates a new enemy dynamically at runtime. It would use an abstract enemy class and various concrete enemy classes that extend from the abstract enemy class. The specific enemy can then be dynamically generated from within the game using the enemy factory. This way the factory method lets a class defer the instantiation to the subclass dynamically as needed.

## Test how kinect motion sensor works with real examples (Roshni - Issue 28)
### Greenfoot Kinect software installation
#### Step 1:
I installed greenfoot kinect software on a Macbook. I needed to install xcode first. I got my developer license from http://developer.apple.com/xcode/ 
#### Step 2:
I installed mac ports on my macbook to install OpenNI and Greenfoot Kinect Server software
#### Step 3:
I followed the instructions on greenfoot.org to install the required libraries.
```
sudo /opt/local/bin/port -v selfupdate
sudo /opt/local/bin/port install libtool
sudo /opt/local/bin/port install libusb-devel +universal
sudo /opt/local/bin/port install boost
sudo /opt/local/bin/port install wxWidgets-3.0
// The wxWidgets-devel packagecould not be found using macports
```
#### Step 4:
Once the pre-requisites have been installed I installed OpenNI, KinectDriver and NITE middleware. (License key for nite: 0KOIk2JeIBYClPWVnMoRKn5cdY4) 
#### Step 5:
I performed basic OpenNI installation testing using the pre-shipped Sample-NiSimpleViewer example that is part of OpenNI installation.
#### Step 6:
With the basic software working I needed the Greenfoot Kinect Server to use my kinect sensor within the greenfoot environment. I downloaded the server from http://www.greenfoot.org/doc/kinect/kinectserver-1.2.tar.gz and then built the code and installed it from the source. The kinect server for Greenfoot got successfully installed.
#### Step 7:
I then ran a sample scenario (available on greenfoot website) for painting on a white canvas using human arm motions. I was successfully able to paint using my hands using Kinect on Greenfoot.

## Research on Leap API & JavaFX(Issue 11)
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

###Research on Game Tools (Shubhra)
Game tool is a software application that facilitates development of video games. These tools have specialized features to support making of 2D, 3d games and games working gestures and all.

Different Types of Games Tool:

Stencyl is a game tool that allows making games with simple drag-and-drop operations. Game development is very easy, simple and fast with it. Games are developed by just arranging blocks of code. Sprite-based games can be easily made on it that run efficiently on different platforms. But complex, advanced Game deveopment is not possible with Stencyl. Eg Zuki quest, Impossible Pixel

GameMaker is another easy tool for developing game by drag-and-drop. It also has features for making multiplayer games, linking with external SDKs and digging into the code. It is versatile and has great features to develop different types of games but also lacks facility to build 2D and 3D games. Some famous games are Hotline Miami, Spelunky

Cocos2D is great tool for building 2D games and is available as open source. It has special features for developing games and very easy to work with. It comes with a complete IDE for developing games.The problem with Cocos2D is that you require expertise in c++ before starting development on Cocos2D. Popular Game Badland is developed using it.

Unity is great tool using which 3D games can be easily built. It has powerful and good built-in libraries that help to develop interactive, complex and games with advanced features like gesture recognition. It is not very typical to learn and thus is great tool for making games of any kind and complexity. Some egs are Alto's Advanture, FireWatch.

Unreal Engine is another great tool for building awesome 3D games. It has features like 3D modelling, landscape systems and much more. It helps to make professional and sophisticated games. Because of its many features, it is little difficult to learn as compared with Unity and also requires expertise in coding. Games like Tekken 7, Daylight are build using it.


###Using Kinect For Game Development (Shubhra)

Kinect is among the motion sensing input devices by Microsoft for Xbox 360 video games. It enables user to control and interact with game through natural human gestures and spoken commands through a web-cam like peripheral device. 

Microsoft Game Studios developed the software technology used in kinect and launched it with Xbox to give a rich, interactive and more real experience of the games in Xbox. The camera technology in kinect is developed by PrimeSense that can interprect gestures through an infrared projectors and special chip to track movement of objects in front of it in 3 dimensions. 

Kinect has features to capture 3D motion, recognize face features and voice commands. Kinect is capable to automatically adjust its sensor based on person's physical movements and game environment and smart enough to ignore obstacles like furniture and other objects that are not involved in game. Kinect can detect and track movements of 6 people, with 2 active palyers. Ideally kinect can track as many people as are in view of kinect camera.

Kinect device is black box with a camera and sensor port in the front balanced on a small tilted motorized platform to have better of players physical movements. This motorized tilt requires more power than that can be supplied by a normal USB port, kinect device is generally with additional power adaptor. For development purposes, kinect connecting cable is required that can connect kinect sensor with the PC.

Benefits of using Kinect for Game Development

As per Microsoft, kinect provides with great features that make it a desirable tool for making interactive games.

Kinect has ability to track to track 6 people and 25 skeletal joints per person- including joints for hand tips, thumbs, and shoulder center. It has great understanding of the soft connective tissue and body positioning which help to develop avatars that are lifelike.

Kinect also provides Visual Gesture Builder that facilitate development of custom gestures recognised by system. It also enables writing of improved codes using machine learning on current gesture inputs.

Kinect can create a mesh of more than 1,000 points on a human face and making a person feel that he is actually inside the game as he can view a avatar quite similar to him on the game screen.

Kinect also has multi-app support enabling multiple applications to use a single sensor simultaneously.

We also want to make a game that is easy to play, simple, short and also make you a part of the game. Kinect has all features for developing such game. Check the fun of playing with kinect https://vimeo.com/34264122



Three.js (Aditya)

Three.js is a cross-browser JavaScript library which is used to create 3D graphics in web browser and display them. The source code is hosted on Github.

Three.js allows the creation of GPU-accelerated 3D animations using Javascript instead of relying on browser plugins. This is possible as with as Three.js uses WebGL.

With three.js, it is easier to write graphical items than it would be using raw JavaScript in conjuction with OpenGL libraries.

Three includes a variety of features such as visual effects, scenes, shaders and objects.

WebGL (Web Graphics Library) is a JavaScript API for rendering interactive 3D computer graphics and 2D graphics within any compatible web browser without the use of plug-ins.

WebGL is widely supported in modern browsers. However its availability is dependent on other factors like the GPU supporting it. 

