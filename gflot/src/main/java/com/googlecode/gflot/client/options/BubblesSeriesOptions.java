package com.googlecode.gflot.client.options;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.googlecode.gflot.client.jsni.JsonObject;

import java.util.Collection;

public final class BubblesSeriesOptions extends AbstractBasicSeriesOptions<BubblesSeriesOptions>{

    public static final BubblesSeriesOptions create()
    {
        return JavaScriptObject.createObject().cast();
    }

    protected BubblesSeriesOptions()
    {
    }

    private static final String ACTIVE_KEY = "active";
    private static final String BUBBLE_LABEL_KEY = "bubblelabel";
    private static final String HIGHLIGHT_KEY = "highlight";


    public static class BubbleLabel extends JsonObject
    {

        private static final String BUBBLE_LABEL_SHOW_KEY = "show";

        public static final BubbleLabel create()
        {
            return JavaScriptObject.createObject().cast();
        }

        protected BubbleLabel()
        {
        }

        public final BubbleLabel add( String category, boolean show )
        {
            put( category, show );
            return this;
        }

        public final BubbleLabel setShowLabel(boolean show)
        {
            put( BUBBLE_LABEL_SHOW_KEY, show );
            return this;
        }

        public final Boolean getShowLabel(){
            return getBoolean(BUBBLE_LABEL_SHOW_KEY);
        }
    }

    public static class BubbleHighlight extends JsonObject
    {

        private static final String BUBBLE_HIGHLIGHT_SHOW_KEY = "show";
        private static final String BUBBLE_HIGHLIGHT_OPACITY_KEY = "opacity";

        public static final BubbleHighlight create()
        {
            return JavaScriptObject.createObject().cast();
        }

        protected BubbleHighlight()
        {
        }

        public final BubbleHighlight setShowHighlight(boolean show)
        {
            put( BUBBLE_HIGHLIGHT_SHOW_KEY, show );
            return this;
        }

        public final BubbleHighlight setOpacityHighlight(double value)
        {
            put( BUBBLE_HIGHLIGHT_OPACITY_KEY, value );
            return this;
        }

        public final Double getOpacity()
        {
            return getDouble( BUBBLE_HIGHLIGHT_OPACITY_KEY );
        }

        public final Boolean getShowHighlight(){
            return getBoolean(BUBBLE_HIGHLIGHT_SHOW_KEY);
        }
    }


    public final BubblesSeriesOptions setActive(boolean active )
    {
        put( ACTIVE_KEY, active );
        return this;
    }

    public final Boolean getActive()
    {
        return getBoolean( ACTIVE_KEY );
    }


    public final BubblesSeriesOptions setBubbleLabel( BubbleLabel bubbleLabel )
    {
        assert null != bubbleLabel : "bubbleLabel can't be null";

        put( BUBBLE_LABEL_KEY, bubbleLabel );
        return this;
    }

    public final BubblesSeriesOptions setBubbleLabel( Collection<String> bubbleLabels )
    {
        assert null != bubbleLabels : "bubbleLabel can't be null";

        JsArrayString array = JavaScriptObject.createArray().cast();
        for ( String bubbleLabel : bubbleLabels )
        {
            array.push( bubbleLabel );
        }
        return setBubbleLabel( array );
    }

    public final BubblesSeriesOptions setBubbleLabel( JsArrayString bubbleLabel )
    {
        assert null != bubbleLabel : "bubbleLabel can't be null";

        put( BUBBLE_LABEL_KEY, bubbleLabel );
        return this;
    }
    public final BubblesSeriesOptions setHighlight( BubbleHighlight bubbleHighlight )
    {
        put( HIGHLIGHT_KEY, bubbleHighlight );
        return this;
    }

    public final BubblesSeriesOptions setHighlight( Collection<String> bubbleHighlights )
    {
        JsArrayString array = JavaScriptObject.createArray().cast();
        for ( String bubbleHighlight : bubbleHighlights )
        {
            array.push( bubbleHighlight );
        }
        return setHighlight( array );
    }

    public final BubblesSeriesOptions setHighlight( JsArrayString bubbleHighlight )
    {
        put( BUBBLE_LABEL_KEY, bubbleHighlight );
        return this;
    }

    public final BubbleHighlight getHighlightAsMap()
    {
        return getJsObject( HIGHLIGHT_KEY );
    }

    public final BubbleLabel getLabelAsMap()
    {
        return getJsObject( BUBBLE_LABEL_KEY );
    }

}
