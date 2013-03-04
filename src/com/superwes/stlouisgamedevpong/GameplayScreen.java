package com.superwes.stlouisgamedevpong;

import com.superwes.games.framework.Game;
import com.superwes.games.framework.Graphics;
import com.superwes.games.framework.Screen;

public class GameplayScreen extends Screen {

	private Paddle paddle1;
	private Paddle paddle2;

	public GameplayScreen(Game game) {
		super(game);
		initializeGame();
	}

	private void initializeGame() {
		paddle1 = new Paddle(game, Assets.logo, 110, 5);
		paddle2 = new Paddle(game, Assets.logo2, 110, 320-5);
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void present(float deltaTime) {
        Graphics g = game.getGraphics();

        g.drawPixmap(Assets.gameBackground, 0, 0);
        paddle1.present(deltaTime);
        paddle2.present(deltaTime);

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
