package com.example.parkfinderapp.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.parkfinderapp.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        /* To get rid of title bar of the splash screen*/
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) //For Newer versions
        {
            final WindowInsetsController insetsController =getWindow().getInsetsController();
            if(insetsController!=null)
            {
                insetsController.hide(WindowInsets.Type.statusBars());
            }
        }
        else // For Older Versions
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        }

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          //This method will be executed once the timer is over
                                          // Start main activity
                                          Intent i = new Intent(SplashActivity.this, MainActivity.class);
                                          startActivity(i);
                                          // close this activity
                                          finish();
                                      }
                                  }, 3000);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*Typeface typeface = Typeface.createFromAsset(getAssets(), "Montserrat-Bold.ttf");
        TextView textView = (TextView)findViewById(R.id.tv_app_name);
        textView.setTypeface(typeface);*/


    }

}