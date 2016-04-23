
public class GameStart extends GameState{
	
	GameStart(){
		super();
	}

	@Override
	public void stopGame() {
		// TODO Auto-generated method stub
		game.setState(game.stopstate);
	}

	@Override
	public void pauseGame() {
		// TODO Auto-generated method stub
		game.setState(game.progressState);
	}

}
