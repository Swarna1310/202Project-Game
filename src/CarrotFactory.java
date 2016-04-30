import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarrotFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarrotFactory extends FoodFactory
{
    /**
     * Act - do whatever the CarrotFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Food getFood(){
        return getCorrectFood("Carrot");
    }
}
