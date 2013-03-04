package com.superwes.stlouisgamedevpong;

import com.superwes.games.framework.Game;
import com.superwes.games.framework.Graphics;
import com.superwes.games.framework.Pixmap;

public class Paddle {

	private final Game game;
	private int x;
	private int y;
	private final Pixmap logo;

	public Paddle(Game game, Pixmap logo, int x, int y) {
		this.game = game;
		this.logo = logo;
		this.x = x;
		this.y = y;
	}

	public void present(float deltaTime) {
        Graphics g = game.getGraphics();
        g.drawPixmap(logo, x, y);
	}

}
