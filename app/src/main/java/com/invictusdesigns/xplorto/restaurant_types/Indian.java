package com.invictusdesigns.xplorto.restaurant_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.invictusdesigns.xplorto.R;
import com.invictusdesigns.xplorto.common_pages.UserDashBoard;

public class Indian extends AppCompatActivity {
    ImageView to_dashboard,indian_buisness_img,indian_buisness_img2,indian_buisness_img3,indian_buisness_img4,indian_buisness_img5,indian_buisness_img6,indian_buisness_img7,indian_buisness_img8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        to_dashboard=findViewById(R.id.to_dasboard);
        indian_buisness_img=findViewById(R.id.indian_buisness_img);
        indian_buisness_img2=findViewById(R.id.indian_buisness_img2);
        indian_buisness_img3=findViewById(R.id.indian_buisness_img3);
        indian_buisness_img4=findViewById(R.id.indian_buisness_img4);
        indian_buisness_img5=findViewById(R.id.indian_buisness_img5);
        indian_buisness_img6=findViewById(R.id.indian_buisness_img6);
        indian_buisness_img7=findViewById(R.id.indian_buisness_img7);
        indian_buisness_img8=findViewById(R.id.indian_buisness_img8);

        to_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserDashBoard.class);
                startActivity(intent);
            }
        });

        indian_buisness_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String banjara = "http://www.torontobanjara.com/";
                Uri webaddress = Uri.parse(banjara);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
        indian_buisness_img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pukka = "https://www.pukka.ca/";
                Uri webaddress = Uri.parse(pukka);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
        indian_buisness_img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brars = "https://www.brars.ca/";
                Uri webaddress = Uri.parse(brars);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        indian_buisness_img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tich = "http://tich.ca/";
                Uri webaddress = Uri.parse(tich);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        indian_buisness_img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cumin = "https://www.cuminkitchen.com/";
                Uri webaddress = Uri.parse(cumin);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        indian_buisness_img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String indilicious = "https://indialicious.com/";
                Uri webaddress = Uri.parse(indilicious);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
        indian_buisness_img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String indianstreet = "http://www.indianstreetfoodco.com/";
                Uri webaddress = Uri.parse(indianstreet);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        indian_buisness_img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lageez = "https://lageez.ca/";
                Uri webaddress = Uri.parse(lageez);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });




    }
}