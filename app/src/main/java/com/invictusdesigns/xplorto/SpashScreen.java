package com.invictusdesigns.xplorto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SpashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 3000;

    //Variables
    ImageView background_image, xplor_img, to_img;
    TextView poweredByLine1, poweredByLine2;
    //Animations
    Animation background_anim, side_anim;
    //SharedPreferences
    SharedPreferences onBoardingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.spash_screen);
        //hooks
        background_image = findViewById(R.id.spash_screen_background_img);
        xplor_img = findViewById(R.id.xplor_img);
        to_img = findViewById(R.id.to_img);

        //Anim Hooks
        background_anim = AnimationUtils.loadAnimation(this, R.anim.background_anim);
        side_anim = AnimationUtils.loadAnimation(this, R.anim.side_anim);
        //Set Animation
        background_image.setAnimation(background_anim);
        xplor_img.setAnimation(side_anim);
        to_img.setAnimation(side_anim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onBoardingScreen = getSharedPreferences("onBoardingScreen", MODE_PRIVATE);
                boolean isFirstTime = onBoardingScreen.getBoolean("firstTime", true);

                if (isFirstTime){
                    SharedPreferences.Editor editor = onBoardingScreen.edit();
                    editor.putBoolean("firstTime", false);
                    editor.commit();

                    Intent intent  = new Intent(getApplicationContext(), OnBoarding.class);
                    startActivity(intent);
                    finish();

                }
                else{

                    Intent intent  = new Intent(getApplicationContext(), UserDashBoard.class);
                    startActivity(intent);
                    finish();
                }

            }
        }, SPLASH_TIMER);


    }
}