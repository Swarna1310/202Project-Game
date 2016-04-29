import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CommandActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommandActor extends Actor
{
    boolean game = false;
    boolean help = false;
    Game game1;
    Help help1;
    GameMenuInvoker menuInvoker;
    ICommand gameStart; 
    ICommand helpMenu;
    GameMenuReceiver menuReceiver;
    
    
    public void act() 
    {
              
        if (Greenfoot.mousePressed(game)){   
            System.out.println("Inside gameinvoker");
            menuInvoker.executeCommand(gameStart);            
        }
        
        if (Greenfoot.mousePressed(help)){
             System.out.println("Inside helpinvoker");
            menuInvoker.executeCommand(helpMenu);            
        }
    }    
    
    public CommandActor(Game game, Help help)
    {
        this.game1 = game;
        this.help1 = help;   
         menuInvoker = new GameMenuInvoker();
         menuReceiver = new GameMenuReceiver();
         gameStart = new GameCommand(menuReceiver,game,help);
         helpMenu = new HelpCommand(menuReceiver,game,help);
    }

    
}
