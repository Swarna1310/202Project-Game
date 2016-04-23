import greenfoot.*; 

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor implements MessageSubject
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MessageObserver mo;
    private static int sc=0;

    public void Score(MessageObserver mo)
    {
        this.mo = mo;
    }
    public void notify(int sco, FruitNinja fw)
    {
     MessageObserver mo = new Message();
     mo.update(sco,fw);   
    }
    public void act() 
    {
        // Add your action code here.
    }    
    public int getScore()
    {
        return sc;
    }
    public void setScore(int score)
    {
        sc=score;
    }
    public void addScore(int score,Game g)
    {
        sc+=score; 
        notify(sc,g);
    }
}
