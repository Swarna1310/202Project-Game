import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends Actor
{
    static int i=0; 
    
    /*States of Game */
    GameStatus status; 
    GameStatus startstate;
    GameStatus progressState;
    GameStatus stopstate;
	HungryPo world;
	Sound sound;
    
    public Game ()  {
        initializeStates(); //state pattern
        GreenfootImage image = getImage();
        image.scale(50,50);
        
    }
    
    /*Initializing states*/
    private void initializeStates(){
		sound = new Sound();
        startstate = new GameStart(this);
        progressState = new GameInProgress(this);
        stopstate = new GameStop(this);
        status = stopstate;
    }
    
    public void act() 
    {
        if (Greenfoot.mousePressed(this)){
            status.startGame();
        setReset(1);
        world=(HungryPo)getWorld();
        world.z=true;
        world.removeInstructions();
        world.setPaintOrder(ScoreBoard.class, Katna.class, Carrot.class, Counter.class);
        world.populate();
        
     }
    }
    
    public int getReset()
    {
        return i;
    }
    
    public void setReset(int i)
    {
        this.i = i;
    }
 
    public void stop(){
        status.stopGame();
    }
   
    public void setState(GameStatus state){
        this.status = state;
		if(status == stopstate){
                //HungryPo world=(HungryPo)getWorld();
                world.gameOver();
                //((HungryPo) getWorld()).gameOver();  
        }
    }
}
