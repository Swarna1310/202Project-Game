import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelFive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelFive extends Level
{
    //private String msg;
    
    /**
     * Act - do whatever the LevelFive wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    public void makeMessage(){
        
        msg = "Level 5 You Made a new World Record for Eating !!!";
    }
    
    /*public void displayMessage(HungryPo fw){
        Show sh = new Show();
        //if(score>=1600 && score<=1650)
         sh.display(msg,fw);
    }*/
    
    public void changeBackground(HungryPo po){
	   po.checkBackground("temple.jpg");
	}
}
