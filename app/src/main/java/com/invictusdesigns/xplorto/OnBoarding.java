package com.invictusdesigns.xplorto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OnBoarding extends AppCompatActivity {
    ViewPager viewPager;
    Button get_started_btn, skip_btn, next_btn;
    LinearLayout dotsLayout;
    SliderAdapter sliderAdapter;
    TextView[] dots;
    Animation animation;
    int currentPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_on_boarding);

        //Hooks
        viewPager = findViewById(R.id.slider);
        dotsLayout = findViewById(R.id.dots);
        get_started_btn = findViewById(R.id.get_started_btn);
        skip_btn = findViewById(R.id.skip_btn);
        next_btn = findViewById(R.id.next_btn);

        //Call Adapter
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);
    }

    public void skip(View view){
        startActivity(new Intent(getApplicationContext(), UserDashBoard.class));
        finish();
    }

    public void next(View view){
        viewPager.setCurrentItem(currentPosition + 1);
    }

    private void addDots(int position) {

        dots = new TextView[4];
        dotsLayout.removeAllViews();

        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);

            dotsLayout.addView(dots[i]);
        }
        if (dots.length > 0) {
            dots[position].setTextColor(getResources().getColor(R.color.pink));
        }
    }


    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            animation = AnimationUtils.loadAnimation(OnBoarding.this, R.anim.bottom_anim);
            addDots(position);
            currentPosition = position;
            if (position == 0) {
                next_btn.setVisibility(View.VISIBLE);
                next_btn.setAnimation(animation);
                skip_btn.setAnimation(animation);
                skip_btn.setVisibility(View.VISIBLE);
                get_started_btn.setVisibility(View.INVISIBLE);
            } else if (position == 1) {
                next_btn.setVisibility(View.VISIBLE);
                skip_btn.setVisibility(View.VISIBLE);

                get_started_btn.setVisibility(View.INVISIBLE);
            } else if (position == 2) {
                next_btn.setVisibility(View.VISIBLE);
                skip_btn.setVisibility(View.VISIBLE);

                get_started_btn.setVisibility(View.INVISIBLE);
            } else {
                next_btn.setVisibility(View.INVISIBLE);
                skip_btn.setVisibility(View.VISIBLE);
                get_started_btn.setAnimation(animation);
                get_started_btn.setVisibility(View.VISIBLE);
            }


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}