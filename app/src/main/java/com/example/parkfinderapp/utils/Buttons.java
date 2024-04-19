package com.example.parkfinderapp.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class Buttons extends androidx.appcompat.widget.AppCompatButton
{


    public Buttons(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyFont();
    }

    private void applyFont() {
        Typeface boldTypeface = Typeface.createFromAsset(getContext().getAssets(), "Montserrat-Bold.ttf");
        setTypeface(boldTypeface);
    }
}
