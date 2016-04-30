import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends Level
{
    /**
     * Act - do whatever the LevelOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    
	
	public void makeMessage(){
		
		msg = "Level 1 You Are A FOODIE !!!";
	}
	
	/*ublic void displayMessage(HungryPo fw){
		//System.out.println(msg);
		Show sh = new Show();
        //if(score>=200 && score<=250)
        // msg=" You are a CUTTER!! ";
        //fw.checkBackground("test.png");
         sh.display(msg,fw);
       // }
	}*/
	
	public void changeBackground(HungryPo po){
	   po.checkBackground("test.png");
	}
}
