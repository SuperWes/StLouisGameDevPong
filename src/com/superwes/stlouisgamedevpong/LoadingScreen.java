package com.superwes.stlouisgamedevpong;

import com.superwes.games.framework.Game;
import com.superwes.games.framework.Graphics;
import com.superwes.games.framework.Graphics.PixmapFormat;
import com.superwes.games.framework.Screen;
import com.superwes.stlouisgamedevpong.Assets;
import com.superwes.stlouisgamedevpong.Settings;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.logoTitle = g.newPixmap("logoTitle.png", PixmapFormat.ARGB4444);
        Assets.logo = g.newPixmap("igda-logo.png", PixmapFormat.ARGB4444);
        Assets.logo2 = g.newPixmap("meetuplogo.png", PixmapFormat.ARGB4444);
        Assets.gameBackground = g.newPixmap("gameBackground.png", PixmapFormat.ARGB4444);
        Assets.ball = g.newPixmap("ball.png", PixmapFormat.ARGB4444);
        
        Assets.click = game.getAudio().newSound("click.ogg");
        Assets.eat = game.getAudio().newSound("eat.ogg");
        Assets.bitten = game.getAudio().newSound("bitten.ogg");
        Settings.load(game.getFileIO());
        game.setScreen(new MainMenuScreen(game));
    }

    @Override
    public void present(float deltaTime) {

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