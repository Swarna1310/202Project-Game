import greenfoot.*;  

public class Noodles extends Food implements Display
{
    
    Noodles()
    {
     super(FoodType.NOODLES);
    }
    
    public void act() 
    {
     objectpath();
    }  
		
    public void objectpath()
    {

    }
    
    public void eat()
    {
     GreenfootImage noodles = new GreenfootImage("noodles.png");
     setImage(noodles);
    }   
}
