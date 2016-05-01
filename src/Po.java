import greenfoot.*;

public class Po extends Actor implements Subject
{
    Food f;
    Observer obs;
    static int count=0;

    public Po(int width, int height)
    public Po(int width, int height)
    {
        setImage(new GreenfootImage(width, height));
        //getImage().setColor(java.awt.Color.GREEN);
    }
    
    public void notifyObservers(Food f, HungryPo fn)
    {
        obs.update(f, fn);
    }
    
    public void act() 
    {
        HungryPo world = (HungryPo)getWorld();
        GreenfootImage panda = new GreenfootImage("./images/panda3.png");
        int x=-10;
        int y=-10;
        UserData[] users = world.getTrackedUsers();
        for (UserData user : users)
        {
            Joint head = user.getJoint(Joint.HEAD);
            x = head.getX();
            y = head.getY()+200;
            getImage().drawImage(panda, x, y);            
            Greenfoot.delay(16);
            getImage().clear();
        }
        
        Food f = (Food) this.getOneIntersectingObject( Food.class);
        obs=new Food();
        if(f!= null) {
                HungryPo fn = (HungryPo)getWorld();
                notifyObservers(f, fn);
                //Greenfoot.delay(20);
                if(f.getX()>x-50 && f.getX()<x+200){
                    if(f.getY()>y-50 && f.getY()<y+200){
                fn.removeObject(f);
                fn.count(10,fn);
                Greenfoot.playSound("cut.mp3");
            }
            }
            }
        Poison p = (Poison) this.getOneIntersectingObject( Poison.class);
        // obs=new Food();
        if(p!= null) {
                HungryPo fn = (HungryPo)getWorld();
                //notifyObservers(f, fn);
                //Greenfoot.delay(20);
                if(p.getX()>x-100 && p.getX()<x+100){
                    if(p.getY()>y-100 && p.getY()<y+100){
                        // Greenfoot.playSound("dying.mp3");
                        // fn.populate();
                        // Greenfoot.stop();
                        fn.count(0,fn);
                        //((HungryPo) getWorld()).gameOver();
						((HungryPo) getWorld()).game.stop();
            }
            }
            }
        }
}
