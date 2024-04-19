package com.example.parkfinderapp.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class EditText extends androidx.appcompat.widget.AppCompatEditText {


    public EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyFont();
    }

    private void applyFont() {
        Typeface boldTypeface = Typeface.createFromAsset(getContext().getAssets(), "Montserrat-Bold.ttf");
        setTypeface(boldTypeface);
    }
}