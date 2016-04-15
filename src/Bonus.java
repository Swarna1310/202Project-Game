import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonus extends Actor implements Command
{
    
	private BonusType select = null;
 
    public void act() 
    {
        // Add your action code here.
    }    
    public Bonus()
    {
    }
    public Bonus(BonusType select) {
		this.select = select;
		
	}
	
	public BonusType getChoice() {
		return select;
	}

	public void setChoice(BonusType select) {
		this.select = select;
	}
    public void call(Bonus b, Game fn)
    {
     GreenfootImage img = b.getImage();
     String bonusName = img.toString();
     if(bonusName.contains("extra"))
     {
      Extra e = new Extra();
      e.pop(fn);
     }
     else if(bonusName.contains("double"))
     {
      Double d = new Double();
      d.pop(fn);
     }
    }
}
