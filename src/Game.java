
public class Game {

	GameStatus status;
	GameStatus startstate;
	GameStatus progressState;
	GameStatus stopstate;
	
	Game(){
		
		startstate = new GameStart(this);
		progressState = new GameInProgress(this);
		stopstate = new GameStop(this);
		status = stopstate;
	}
	
	public void setState(GameStatus status){
		this.status = status;
	}
}
