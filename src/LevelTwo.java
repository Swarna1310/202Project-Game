import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends Level
{
    //private String msg;
    
    /**
     * Act - do whatever the LevelTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    public void makeMessage(){
        
        msg = "Level 2 You Are A GOURMET !!!";
    }
    
    /*public void displayMessage(HungryPo fw){
        Show sh = new Show();
        //if(score>=400 && score<=450)
         sh.display(msg,fw);
    }*/
    
    public void changeBackground(HungryPo po){
	   po.checkBackground("temple.jpg");
	}
}
