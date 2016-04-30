import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FoodDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodDecorator extends Actor implements Command
{
    
	private FoodDecoratorType select = null;
    /**
     * Act - do whatever the FoodDecorator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public FoodDecorator()
    {
    }
    public FoodDecorator(FoodDecoratorType select) {
		this.select = select;
		
	}
	
	public FoodDecoratorType getChoice() {
		return select;
	}

	public void setChoice(FoodDecoratorType select) {
		this.select = select;
	}
    public void call(FoodDecorator b, HungryPo hp)
    {
     GreenfootImage img = b.getImage();
     String FoodDecoratorName = img.toString();
     if(FoodDecoratorName.contains("DecoratedCookie"))
     {
      DecoratedCookie e = new DecoratedCookie();
      e.pop(hp);
     }
     else if(FoodDecoratorName.contains("DecoratedDumpling"))
     {
      DecoratedDumpling d = new DecoratedDumpling();
      d.pop(hp);
     }
    }
}
