package io.piotrjastrzebski.box2dinterpolation.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.piotrjastrzebski.box2dinterpolation.B2DInterp;
import io.piotrjastrzebski.box2dinterpolation.Box2dInterpolationScreen;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = B2DInterp.WIDTH;
		config.height = B2DInterp.HEIGHT;
		new LwjglApplication(new B2DInterp(), config);
	}
}
