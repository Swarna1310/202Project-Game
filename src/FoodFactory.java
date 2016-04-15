import greenfoot.*;

public class FoodFactory extends Actor
{   
   // Have a factory method to create concrete food
   public static Food create(FoodType choice) {
        Food food = null;
        switch (choice) {
            case CARROT:
                food = new Carrot();
                break;
            case COOKIE:
                food = new Cookie();
                break;
            case DUMPLING:
                food = new Dumpling();
                break;
            case NOODLES:
                food = new Noodles();
                break;
        }
        return food;
    }
    
}
