import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HungryPo extends World 
{
    Counter counter = new Counter("Score: ");
    static int x=0;
    static int xc=0;
    //static int sc=0;
    Instructions ins;
    Game game;
    Score s;
    boolean c = true;
    public static boolean z = false;
    public static int num=0, num1=0;
    Double d;
    public HungryPo()
    {    
        super(600, 500, 1);
        this.showStartScreen();
        //Greenfoot.setWorld(this);
    }
               
    public void showStartScreen(){
        game = new Game();
        ins = new Instructions();
        addObject(ins,300,250);
        addObject(game,300,423);
        
    }
    
    public void removeInstructions(){
        this.removeObject(game);
        this.removeObject(ins);
    }
    
    
    public void act() 
    {
       //if(game.getReset()==1) 
      // Show sh = new Show();
      //  String msg=" You are ACTING!! ";
     //    sh.display(msg,this);
       //shubh test ends
       
       
       if(game.status != game.stopstate) //using states of game
        reset();  
    }
    
    public void reset()
    {
       //shubh test
       //Show sh = new Show();
      //  String msg=" You are a RESETING!! ";
       //  sh.display(msg,this);
       //shubh test ends
        if(c==true)
        {
         
         MouseInfo m = Greenfoot.getMouseInfo();
         if(m != null && Greenfoot.mousePressed(null)) {
            int x = m.getX();
            int y = m.getY();
            addObject(new Panda(), x, y);
            c=false;
        }
    }
        if(z==true){
          
        if(Greenfoot.getRandomNumber(300) < 3) {
            xc=Greenfoot.getRandomNumber(600);
            if(xc>=20 && xc<=580)           // so that fruit does'nt go out of the screen
            {
                x=Greenfoot.getRandomNumber(6);                 
              switch(x)
              {           
                case 0:
                  addObject(new Poison(), xc, 100);
                  break;
                case 1:
                  FoodFactory carrotFactory = new CarrotFactory();
                  addObject(carrotFactory.getFood(),xc, 100);
                  break;
                case 2:
                  FoodFactory cookieFactory = new CookieFactory();
                  addObject(cookieFactory.getFood(),xc, 100);
                  break;
                case 3:
                  FoodFactory dumplingFactory = new DumplingFactory();
                  addObject(dumplingFactory.getFood(),xc, 100);
                  break;
                case 4:
                  FoodFactory bambooFactory = new BambooFactory();
                  addObject(bambooFactory.getFood(),xc, 100);
                  break;  
                case 5:
                  FoodFactory noodlesFactory = new NoodlesFactory();
                  addObject(noodlesFactory.getFood(),xc, 100);
                  break; 
                
              }
              if((counter.getValue()>0 && counter.getValue()%200==0) && num==0 )
              {
                num=1;
                addObject(BonusFactory.create(BonusType.DOUBLE), xc,500);
              }

            }   
            
            if((counter.getValue()>0 && counter.getValue()%200!=0 && counter.getValue()%100==0) && num1==0 )
              {
                num1=1;
                addObject(BonusFactory.create(BonusType.EXTRA), 0,Greenfoot.getRandomNumber(500));
              }
        }
    }
    }
    public void count(int score, HungryPo hp)
    {
      num=0;
      num1=0;
      counter.add(score);      //score on the screen being incremented
      s = new Score();   
      s.addScore(score,hp);       //score on final display
    }
    

    public void gameOver() 
    {
        removeObject(counter);
        addObject(new GameOver(), 300, 250);
        addObject(new ScoreBoard(s.getScore()), getWidth()/2, getHeight()/2);
        s.setScore(0);
        Greenfoot.playSound("pop.wav");
        Greenfoot.stop();
        //game.setReset(0);
        game.setState(game.stopstate); //setting game states
    }


    public void populate()
    {
        addObject(counter, 100, 460);
    }
    
    public void addObjectFromActor(Food f, int a, int b)
    {
        addObject(f,a,b);
    }
    
    
    /*shubh changing levels*/
     public void checkBackground(String img)
    {
           this.setBackground(img);
    }
    
}
