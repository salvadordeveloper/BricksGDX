package com.salvador.bricks.Objects;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.Stage;

import static com.salvador.bricks.Objects.ResourceManager.getMusic;
import static com.salvador.bricks.Objects.ResourceManager.getSound;

/**
 * Created by Salvador on 01/03/2018.
 */

public class SoundManager {

    public static Music musicBackground;
    public static Sound brickSound;

    public static void loadSounds(){
        musicBackground = getMusic("music.mp3");
        brickSound = getSound("sound.ogg");
    }

    public static void playMusicBackground(){
        musicBackground.setLooping(true);
        musicBackground.play();
    }

    public static void stopMusicBackground(){
        musicBackground.dispose();
        musicBackground.stop();
    }

    public static void playBrickSound(){
        brickSound.play();
    }
}
