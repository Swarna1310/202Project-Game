import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Show extends Actor
{
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void display(String msg, HungryPo hp){
        Message m = new Message();
        GreenfootImage g = new GreenfootImage(msg, 20, Color.WHITE, Color.BLACK); 
        m.setImage(g);
        hp.addObject(m, 275 , 50);
    }
}
