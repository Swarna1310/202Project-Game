import greenfoot.*;  

public class Bamboo extends Food implements Display
{
    
    Bamboo()
    {
     super(FoodType.Bamboo);
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
     GreenfootImage bamboo = new GreenfootImage("bamboo.png");
     setImage(bamboo);
    }
}
