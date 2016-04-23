
public class Game {

	GameStatus status;
	GameStatus startstate;
	GameStatus progressState;
	GameStatus stopstate;
	Panda panda;
	Sound sound;
	
	public static Game game;
	
	private Game(){
		
		sound = new Sound();
		startstate = new GameStart();
		progressState = new GameInProgress();
		stopstate = new GameStop();
		status = stopstate;
	}
	
	public static Game getGameInstance(){
		if(game == null)
			game = new Game();
		return game;
	}
	
	public void setState(GameStatus state){
		this.status = state;
		if(status == startstate){
			panda = new Panda();
		}
	}
}
