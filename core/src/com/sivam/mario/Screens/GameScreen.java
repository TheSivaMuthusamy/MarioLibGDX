package com.sivam.mario.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.sivam.mario.MarioBros;
import com.sivam.mario.Scenes.Display;

/**
 * Created by Siva
 */

public class GameScreen implements Screen {

    //fields
    private MarioBros game;

    private OrthographicCamera gameCamera;
    private Viewport gamePort;
    private Display display;
    //Constructor
    public GameScreen(MarioBros game) {
        this.game = game;
        gameCamera = new OrthographicCamera();
        gamePort = new FitViewport(MarioBros.V_WIDTH, MarioBros.V_HEIGHT, gameCamera);
        display = new Display(game.getBatch());
    }


    @Override
    public void show() {

    }


    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.getBatch().setProjectionMatrix(display.stage.getCamera().combined);
        display.stage.draw();
    }

    @Override
    public void resize(int width, int height) {

        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
