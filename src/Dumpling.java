import greenfoot.*;  

public class Dumpling extends Food implements Display
{
    
    Dumpling()
    {
     super(FoodType.DUMPLING);
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
     GreenfootImage dumpling = new GreenfootImage("dumpling.png");
     setImage(dumpling);
    }   
}
