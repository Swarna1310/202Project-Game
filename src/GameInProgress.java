
public class GameInProgress extends GameState{

	GameInProgress(){
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
