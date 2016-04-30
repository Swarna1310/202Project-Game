import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class FoodDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DecoratedCookie extends FoodDecorator
{
    int num=0;
    int x=2,y=-2;
    int flag=0;
    static int loop=0,ht;
    
    DecoratedCookie(){
        super(FoodDecoratorType.EXTRA);
    }
    public void act(){
      setLocation(getX(), getY() +y);
        ht=100;
        if(getY()<=ht)
        {
            num++;
            loop=Greenfoot.getRandomNumber(2);
            if(loop==0)//loop - how much dist to move after reaching a particular height(ht)
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
       
    }   
   
     public void pop(HungryPo hp) 
    {
        	Greenfoot.playSound("cut.mp3");
        	hp.count(40,hp);
        	GreenfootImage FoodDecorator = new GreenfootImage("explosion.png");
        	setImage(FoodDecorator);
     }   
}

