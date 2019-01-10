package com.venjer.hex;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.venjer.hex.view.GameScreen;


public class Main extends Game {

	private Screen gameScreen;

	@Override
	public void create() {
        gameScreen = new GameScreen();
        setScreen(gameScreen);
	}
}
