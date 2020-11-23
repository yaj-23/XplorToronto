package com.invictusdesigns.xplorto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class BarPage extends AppCompatActivity {

    ImageView buisness_img, buisness_img2, buisness_img3, buisness_img4, buisness_img5, buisness_img6;
    TextView buisness_title, buisness_title2, buisness_title3, buisness_title4, buisness_title5, buisness_title6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_bar_page);

        //Hooks
        buisness_img = findViewById(R.id.bar_buisness_img);
        buisness_img2 = findViewById(R.id.bar_buisness_img2);
        buisness_img3 = findViewById(R.id.bar_buisness_img3);
        buisness_img4 = findViewById(R.id.bar_buisness_img4);
        buisness_img5 = findViewById(R.id.bar_buisness_img5);
        buisness_img6 = findViewById(R.id.bar_buisness_img6);

        buisness_title = findViewById(R.id.bar_buisness_title);
        buisness_title2 = findViewById(R.id.bar_buisness_title2);
        buisness_title3 = findViewById(R.id.bar_buisness_title3);
        buisness_title4 = findViewById(R.id.bar_buisness_title4);
        buisness_title5 = findViewById(R.id.bar_buisness_title5);
        buisness_title6 = findViewById(R.id.bar_buisness_title6);

        // Bar Raval  CLICK LISTENER
        buisness_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String barraval = "https://www.thisisbarraval.com/";
                Uri webaddress = Uri.parse(barraval);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String barraval = "https://www.thisisbarraval.com/";
                Uri webaddress = Uri.parse(barraval);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        // Birrereiavolo CLICK LISTENER
        buisness_img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String birrereiavolo  = "https://www.birreriavolo.com/";
                Uri webaddress = Uri.parse(birrereiavolo);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String birrereiavolo  = "https://www.birreriavolo.com/";
                Uri webaddress = Uri.parse(birrereiavolo);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        // Farside CLICK LISTENER
        buisness_img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String farside = "https://www.farsidebar.com/";
                Uri webaddress = Uri.parse(farside);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String farside = "https://www.farsidebar.com/";
                Uri webaddress = Uri.parse(farside);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        // Mahjong CLICK LISTENER
        buisness_img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mahjong = "http://www.mahjongbar.com/home";
                Uri webaddress = Uri.parse(mahjong);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mahjong = "http://www.mahjongbar.com/home";
                Uri webaddress = Uri.parse(mahjong);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        /**
        // Summer's CLICK LISTENER
        buisness_img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String summers = "https://www.summersicecream.com/";
                Uri webaddress = Uri.parse(summers);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String summers = "https://www.summersicecream.com/";
                Uri webaddress = Uri.parse(summers);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        // Booyah CLICK LISTENER
        buisness_img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String booyah = "https://booyah-inc.com/";
                Uri webaddress = Uri.parse(booyah);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String booyah = "https://booyah-inc.com/";
                Uri webaddress = Uri.parse(booyah);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });*/

    }
}