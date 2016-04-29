import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameCommand extends Actor implements ICommand
{

    
    private GameMenuReceiver menureceiver;
    private Game game;
    private Help help;
    GameCommand(GameMenuReceiver menureceiver,Game g, Help h){
        this.menureceiver = menureceiver;
        this.game = g;
        this.help = h;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void execute(){
        menureceiver.doStartAction();
    }
}
