package com.superwes.stlouisgamedevpong;

import com.superwes.games.framework.Game;
import com.superwes.games.framework.Graphics;
import com.superwes.games.framework.Pixmap;
import com.superwes.games.framework.math.Rectangle;

public class Ball {

	private Pixmap asset;
	private final Game game;
	private Rectangle rectangle;

	public Ball(Game game, int x, int y) {
		this.game = game;
		asset = Assets.ball;
		rectangle = new Rectangle(x - asset.getWidth()/2, y - asset.getHeight()/2, asset.getWidth(), asset.getHeight());
	}

	public void present(float deltaTime) {
		Graphics g = game.getGraphics();
		g.drawPixmap(asset, (int)rectangle.x, (int)rectangle.y);
	}

	public void update() {
		
	}
}
