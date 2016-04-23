import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Bonus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Double extends Bonus
{
    static int c=0;
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int num=0;
    int x=1,y=-1;
    int flag=0;
    static int loop=0,ht;
    public void act() 
    {
        setLocation(getX(), getY() +y);
        ht=100;//till what height can fruit travel
        if(getY()<=ht)
        {
            num++;
            loop=Greenfoot.getRandomNumber(2);
            if(loop==0)//loop - how much dist to move after reaching a particular height(ht)
            {  
             move(-20);   
            }
            else
            {
             move(20);   
            }
            flag=1;
            x=x*(1);
            y=y*(-1);
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
    
     public void pop(FruitNinja fn) 
    {
        	Greenfoot.playSound("cut.mp3");
        	//((FruitNinja) getWorld()).countDouble();
        	fn.count(50,fn);
        	GreenfootImage bonus = new GreenfootImage("explosion.png");
        	setImage(bonus);
    }   
    
}
