import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelFour extends Level
{
    //private String msg;
    
    /**
     * Act - do whatever the LevelFour wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
   public void makeMessage(){
        
        msg = "Level 4 You Just Beated SUMOS !!!";
    }
    
   /* public void displayMessage(HungryPo fw){
        Show sh = new Show();
        //if(score>=1100 && score<=1150)
         sh.display(msg,fw);
    }*/
    
    public void changeBackground(HungryPo po){
	   po.checkBackground("test.png");
	}
}
