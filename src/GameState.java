
public class GameState implements GameStatus{
	
	Game game;
	
	GameState(){
		this.game = Game.getGameInstance();
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		/* default behaviour do nothing.
		 * */
	}

	@Override
	public void stopGame() {
		// TODO Auto-generated method stub
		/* default behaviour do nothing.
		 * */
	}

	@Override
	public void pauseGame() {
		// TODO Auto-generated method stub
		/* default behaviour do nothing.
		 * */
	}

}
