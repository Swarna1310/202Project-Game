import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;

public class Message extends Actor implements MessageObserver
{
  static String msg;
   
    public Message()
    {
    }
    
    public void update(int score, Game g){
    
     Show sh = new Show();
        if(score>=250 && score<=300){
         msg=" You are a CUTTER!! ";
         sh.display(msg,fw);
        }
        else if(score>=500 && score<=550){
         msg=" You are a CHEF!!!! ";
         sh.display(msg,fw);
        }
        }
        }
