import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpCommand extends Actor implements ICommand
{
   private GameMenuReceiver menureceiver;
   private Game game;
   private Help help;
    HelpCommand(GameMenuReceiver menureceiver,Game g, Help h){
        this.menureceiver = menureceiver;
        this.game = g;
        this.help = h;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void execute(){
        menureceiver.doHelpAction();
    }
}
