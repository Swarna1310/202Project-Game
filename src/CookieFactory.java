import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CookieFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CookieFactory extends FoodFactory
{
    /**
     * Act - do whatever the CookieFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Food getFood(){
        return getCorrectFood("Cookie");
    }
}
