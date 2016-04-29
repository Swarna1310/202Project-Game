import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMenuInvoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenuInvoker extends Actor
{
 
    public void act() 
    {
        // Add your action code here.
    }    
    

  public void executeCommand(ICommand command){
    command.execute();
  }

}
