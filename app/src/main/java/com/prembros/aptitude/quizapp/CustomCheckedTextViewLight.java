package com.prembros.aptitude.quizapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/*
 * Created by Prem $ on 7/2/2016.
 */
public class CustomCheckedTextViewLight extends CheckedTextView {
    public CustomCheckedTextViewLight(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public CustomCheckedTextViewLight(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public CustomCheckedTextViewLight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = Typeface.createFromAsset(context.getAssets(), "fonts/seguil.ttf");
        setTypeface(customFont);
    }
}
