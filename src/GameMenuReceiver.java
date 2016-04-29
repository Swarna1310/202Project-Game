import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMenuReceiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenuReceiver extends Actor
{
    /**
     * Act - do whatever the GameMenuReceiver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void doStartAction(){
        System.out.println("In game receiver");
        HungryPo world=(HungryPo)getWorld();
        world.z=true;
        world.removeInstructions();
        world.setPaintOrder(ScoreBoard.class, Katna.class, Carrot.class, Counter.class);
        world.populate();
        
    }
    
    public void doHelpAction(){
        System.out.println("In help receiver");
        HungryPo world=(HungryPo)getWorld();
        Instructions ins = new Instructions();
        world.addObject(ins,200,200); 
    }
}
