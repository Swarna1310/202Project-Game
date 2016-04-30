import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends Level
{
    //private String msg;
    
    /**
     * Act - do whatever the LevelThree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void makeMessage(){
        
        msg = "Level 3 You Are Really HUNGRY !!!";
    }
    
    /*public void displayMessage(HungryPo fw){
        Show sh = new Show();
        //if(score>=700 && score<=750)
         sh.display(msg,fw);
    }*/
    
    public void changeBackground(HungryPo po){
	   po.checkBackground("test.png");
	}
}
