package com.example.parkfinderapp.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class TextViewBold extends androidx.appcompat.widget.AppCompatTextView {
    public TextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.create("Montserrat-bold.ttf", Typeface.NORMAL));

    }

}
