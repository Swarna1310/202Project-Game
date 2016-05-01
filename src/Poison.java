import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poison here.
 * 
 * @author (Roshni) 
 * @version (a version number or a date)
 */
public class Poison extends Actor
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    int num=0;
    int x=1,y=-1;
    int flag=0;
    static int loop=0,ht;
   public void act() 
    {
        trajectory();
    }
     public void trajectory() {
       setLocation(getX(), getY() +y);
       ht=100;
         if(getY()<=ht)
        {
            num++;
            loop=Greenfoot.getRandomNumber(2);
            if(loop==0)
            {  
             move(-20);   
            }
            else
            {
             move(-20);
            }
            flag=1;
            x=x*(2);
            y=y*(-2);
        }
        
        if(flag==1 && getY()==0)
        {
            getImage().setTransparency(0);
            flag=0;
        }

       
        if(getY()>=490 && num>0)
        {
           getWorld().removeObject(this);
        }   
    }
    
    /**
     * Pop this poison.
     */
    public void pop() 
    {
        Greenfoot.playSound("cut.mp3");
        GreenfootImage poison= new GreenfootImage("explosion.png");
        setImage(poison);
        Greenfoot.delay(2);
        getWorld().removeObject(this);
    }   
}
