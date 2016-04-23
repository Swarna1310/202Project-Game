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
		setLocation(getX(), getY() +y);
        ht=100;
        if(getY()<=ht)
        {
            num++;
            loop=Greenfoot.getRandomNumber(2);
            if(loop==0)
            {  
             move(-20);   
            }
            else
            {
             move(20);   
            }
            flag=1;
            x=x*(2);
            y=y*(-2);
        }
        
        if(flag==1 && getY()==0)
        {
            getImage().setTransparency(0);
            flag=0;
        }
        if(getX()<=10 || getX()>=590)
        {
            move(-25);
            x=0;
        }
        //make the cookie disappear
        if(getY()>=490 && num>0)
           getWorld().removeObject(this); 
    }
    
    public void eat()
    {
     GreenfootImage cookie = new GreenfootImage("cookie.png");
     setImage(cookie);
    }   
}
