import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Level extends Actor
{
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String msg;
    abstract void makeMessage();
	//abstract void displayMessage(HungryPo po);
	abstract void changeBackground(HungryPo po);
	
	public void showMessage(HungryPo po){
		
		makeMessage();
		changeBackground(po);
		
		displayMessage(po);
	}
	
	public void displayMessage(HungryPo fw){
		//System.out.println(msg);
		Show sh = new Show();
        //if(score>=200 && score<=250)
        // msg=" You are a CUTTER!! ";
        //fw.checkBackground("test.png");
         sh.display(msg,fw);
       // }
	}
	
    public void act() 
    {
        // Add your action code here.
    }    
}
