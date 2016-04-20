import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HelpMenu extends Actor implements Command
{
    
	private Play select = null;
 
    public void act() 
    {
        // Add your action code here.
    }    
    public PlayMenu()
    {
    }
    public PlayMenu(Play select) {
		this.select = select;
		
	}
	
	public Play getChoice() {
		return select;
	}

	public void setChoice(BonusType select) {
		this.select = select;
	}
    public void call(PlayMenu b, Game fn)
    {
     GreenfootImage img = b.getImage();
     String Helpcommand = img.toString();
     if(Helpcommand.contains(“Help”))
     {
        Help.execute();
     }
     else if(Helpcommand.contains(“Options”))
     {
     Options.execute();
     }
    }

}
