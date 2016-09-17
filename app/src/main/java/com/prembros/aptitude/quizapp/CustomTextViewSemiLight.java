package com.prembros.aptitude.quizapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/*
 * Created by Prem $ on 7/2/2016.
 */
public class CustomTextViewSemiLight extends TextView {
    public CustomTextViewSemiLight(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public CustomTextViewSemiLight(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public CustomTextViewSemiLight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/seguisl.ttf"));
    }
}
