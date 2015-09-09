package io.piotrjastrzebski.box2dinterpolation.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import io.piotrjastrzebski.box2dinterpolation.B2DInterp;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(B2DInterp.WIDTH, B2DInterp.HEIGHT);
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return new B2DInterp();
        }
}
