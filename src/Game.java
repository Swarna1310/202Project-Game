
public class Game {

	GameStatus status;
	GameStart startstate;
	GameInProgress progressState;
	GameStop stopstate;
	
	Game(){
		startstate = new GameStart();
		progressState = new GameInProgress();
		stopstate = new GameStop();
		status = stopstate;
	}
	
	public void setState(GameStatus status){
		this.status = status;
	}
}
