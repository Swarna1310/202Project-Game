
public abstract class Level {
	
	abstract void makeMessage();
	abstract void displayMessage();
	
	public void showMessage(){
		
		makeMessage();
		
		displayMessage();
	}
	

}
