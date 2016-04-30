import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class DecoratedDumpling here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DecoratedDumpling extends FoodDecorator
{

    /**
     * Act - do whatever the DecoratedDumpling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int num=0;
    int x=1,y=-1;
    int flag=0;
    static int loop=0,ht;
    
    DecoratedDumpling(){
        super(FoodDecoratorType.DOUBLE);
    }
    public void act()
    {
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
        	hp.count(50,hp);
        	GreenfootImage DecoratedDumpling = new GreenfootImage("explosion.png");
        	setImage(DecoratedDumpling);
    }

}
