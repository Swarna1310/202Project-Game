import greenfoot.*;  

public class Cookie extends Food implements Display 
{
    
    Cookie()
    {
     super(FoodType.COOKIE);
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
     GreenfootImage cookie = new GreenfootImage("cookie.png");
     setImage(cookie);
    }   
}
