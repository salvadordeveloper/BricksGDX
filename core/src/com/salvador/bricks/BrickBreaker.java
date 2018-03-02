package com.salvador.bricks;

/**
 * Created by Salvador on 08/02/2018.
 */
import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

import com.salvador.bricks.Screens.GameScreen;
import com.salvador.bricks.Screens.MenuScreen;

public class BrickBreaker extends Game {

    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
