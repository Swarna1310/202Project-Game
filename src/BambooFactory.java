import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BambooFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BambooFactory extends FoodFactory
{
    /**
     * Act - do whatever the BambooFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
     public Food getFood(){
        return getCorrectFood("Bamboo");
    }
}
