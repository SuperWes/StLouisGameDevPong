package com.superwes.stlouisgamedevpong;

import java.util.List;

import com.superwes.games.framework.Game;
import com.superwes.games.framework.Graphics;
import com.superwes.games.framework.Input.TouchEvent;
import com.superwes.games.framework.Screen;

public class MainMenuScreen extends Screen {
    public MainMenuScreen(Game game) {
        super(game);               
    }   

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();       
        
        int len = touchEvents.size();
        for(int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if(event.type == TouchEvent.TOUCH_UP) {
                if(inBounds(event, 0, 0, 320, 480) ) {
                    //game.setScreen(new SelectLevelToPlayScreen(game));
                    game.setScreen(new GameplayScreen(game));
                    if(Settings.soundEnabled)
                        Assets.click.play(1);
                    return;
                }
            }
        }
    }
    
    @Override
    public void present(float deltaTime) {
        Graphics g = game.getGraphics();
        
        g.drawPixmap(Assets.logoTitle, 0, 0);
    }

    @Override
    public void pause() {
    	
    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
