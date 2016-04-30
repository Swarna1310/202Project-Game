import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor implements MessageObserver
{
    //GreenfootImage g;
    static String msg;
    Level level;
   
    public Message()
    {
    }
    
    public void update(int score, HungryPo fw){
        
        switch(score){
            case 200:
                level = new LevelOne();
                level.showMessage(fw);
                break;
            case 400:
                level = new LevelTwo();
                level.showMessage(fw);
                break;
            case 700:
                level = new LevelThree();
                level.showMessage(fw);
                break;
            case 1100:
                 level = new LevelFour();
                level.showMessage(fw);
                break;
            case 1600:
                level = new LevelFive();
                level.showMessage(fw);
                break;
                
        }
      
     }   
    }
