package com.example.parkfinderapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class BoldTextView extends AppCompatTextView {

    public BoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyFont();
    }


    private void applyFont() {
        Typeface boldTypeface = Typeface.createFromAsset(getContext().getAssets(), "Montserrat-Bold.ttf");
        setTypeface(boldTypeface);
    }
}
