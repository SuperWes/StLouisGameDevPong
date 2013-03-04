package com.superwes.stlouisgamedevpong;

import com.superwes.games.framework.Screen;
import com.superwes.games.framework.impl.AndroidGame;

public class PongGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
}