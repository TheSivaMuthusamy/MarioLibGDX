package com.sivam.mario;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sivam.mario.Screens.GameScreen;

public class MarioBros extends Game {

	private SpriteBatch batch;
	public static final int V_WIDTH = 640, V_HEIGHT = 480;
	

	public void create () {
		batch = new SpriteBatch();
		setScreen(new GameScreen(this));
	}


	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}

	public SpriteBatch getBatch() {
		return batch;
	}
}
