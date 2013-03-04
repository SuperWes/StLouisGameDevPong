package com.superwes.games.framework;

import com.superwes.games.framework.Input.TouchEvent;

public abstract class Screen {
    protected final Game game;

    public Screen(Game game) {
        this.game = game;
    }

    public abstract void update(float deltaTime);

    public abstract void present(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();
    
    public boolean inBounds(TouchEvent event, int x, int y, int width,
			int height) {
		return BoundsHelper.inBounds(event, x, y, width, height);
	}
}
