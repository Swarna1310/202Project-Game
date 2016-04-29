import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A dart is used to pop balloons.
 * 
 * @author Poul Henriksen
 */
public class Panda extends Actor implements Subject
{
    /**
     * Make the dart follow the mouse and check for mouseclicks.
     */
    static boolean shadowImagery = true;
    static int count=0;
    Food f;
    Bonus bon;
    Observer obs;

    public void Panda(Observer obs)
    {
        this.obs=obs;
    }
    public void notifyObservers(Food f, HungryPo hp)
        {
            obs.update(f, hp);
        }
        
    public void act() 
    {   
        if(Greenfoot.mousePressed(this))
        {
          getImage().setTransparency(200);
        }
        else if(Greenfoot.mouseClicked(this))
        {
          getImage().setTransparency(0);
        }
        
        // Follow the mouse
        if(Greenfoot.mouseDragged(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            
            if (shadowImagery==true){
               getWorld().addObject(new Shadow(getImage()),getX(),getY());}
            
            setLocation(mouse.getX(), 400);
            //setLocation(mouse.getX(), mouse.getY());
        }
        
        
        if(Greenfoot.mouseDragged(null)) {
            Food f = (Food) getOneIntersectingObject( Food.class);
            obs=new Food();
            if(f!= null) {
                HungryPo hp = (HungryPo)getWorld();
                notifyObservers(f, hp);
                hp.removeObject(f);
                
            }
        }
                     
        
        if(Greenfoot.mouseDragged(null)) {     
            Bonus b = (Bonus) getOneIntersectingObject(Bonus.class);
            bon=new Bonus();
            if(b != null) {
                HungryPo hp = (HungryPo)getWorld();
                bon.call(b,hp);
                hp.removeObject(b);
            }
        }
        
        if(Greenfoot.mouseDragged(null)) {
            Poison poison = (Poison) getOneIntersectingObject( Poison.class);
            if(poison != null) {
                poison.pop();
                ((HungryPo) getWorld()).gameOver();
            }
        }
    }    
    
}
