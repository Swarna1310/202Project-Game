import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Bonus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Extra extends Bonus
{
    static int c=0;
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+2, getY() );
        if (getX() == 590) {
            getWorld().removeObject(this);
            FruitNinja.num=0;
        }
    }    
     public void pop(FruitNinja fn) 
    {
        	Greenfoot.playSound("cut.mp3");
        	//((FruitNinja) getWorld()).countExtra();
        	fn.count(20,fn);
        	GreenfootImage bonus = new GreenfootImage("explosion.png");
        	setImage(bonus);
     }   
}
