import greenfoot.*;

public abstract class FoodFactory extends Actor
{   
   public abstract Food getFood();  
   
   private static final HashMap foodMap = new HashMap();

   public static Food getCorrectFood(String label) {
		Food food = (Food) foodMap.get(label);

		if (food == null) {
			if (label.equals("Carrot")) {
				food = new Carrot();
			} else if (label.equals("Cookie")) {
				food = new Cookie();
			}else if (label.equals("Dumpling")) {
				food = new Dumpling();
			}else if (label.equals("Bamboo")) {
				food = new Bamboo();
			}else if (label.equals("Noodles")) {
				food = new Noodles();
			}
			foodMap.put(label, food);
		}
		return food;
	}
}
