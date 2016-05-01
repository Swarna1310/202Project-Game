import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DumplingFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DumplingFactory extends FoodFactory
{
    /**
     * Act - do whatever the DumplingFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Food getFood(){
        return new Dumpling();
    }
}
