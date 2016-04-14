import greenfoot.*;  
import java.util.*;

// Need to add an Observer interface with an update method 
public class Food extends Actor implements Observer
{
    private FoodType choice = null;
   
    public Food(FoodType choice) {
        this.choice = choice;
    }

    public FoodType getChoice() {
        return choice;
    }

    public void setChoice(FoodType choice) {
        this.choice = choice;
    }
    
    public void update()
    {
     // Add update code here
     
    }
}
