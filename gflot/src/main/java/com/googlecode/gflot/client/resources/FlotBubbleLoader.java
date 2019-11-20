package com.googlecode.gflot.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;
import com.googlecode.gflot.client.util.JavaScriptInjector;

public class FlotBubbleLoader extends DefaultLoader{

    interface Bundle
            extends ClientBundle
    {
        @Source( "jquery.flot.bubbles.js" )
        TextResource flotBubbles();
    }

    private FlotBubbleLoader.Bundle bundle;

    private FlotBubbleLoader.Bundle getBundle()
    {
        if ( null == bundle )
        {
            bundle = GWT.create( FlotBubbleLoader.Bundle.class );
        }
        return bundle;
    }

    private boolean loaded;

    @Override
    public void load() {
        if ( !loaded )
        {
            JavaScriptInjector.inject( getBundle().flotBubbles().getText() );
            loaded = true;
        }
    }
}
