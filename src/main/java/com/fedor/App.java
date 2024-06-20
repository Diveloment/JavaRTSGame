package com.fedor;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class App
{
    public static void main( String[] args )
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "RTS";
        config.width = 800;
        config.height = 600;
        new LwjglApplication(new Bootstrap(), config);
    }
}
