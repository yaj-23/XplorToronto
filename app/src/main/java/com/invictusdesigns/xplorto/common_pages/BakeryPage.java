package com.invictusdesigns.xplorto.common_pages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.invictusdesigns.xplorto.R;

public class BakeryPage extends AppCompatActivity {

    ImageView buisness_img, buisness_img2, buisness_img3, buisness_img4, buisness_img5, buisness_img6;
    TextView buisness_title, buisness_title2, buisness_title3, buisness_title4, buisness_title5, buisness_title6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_bakery_page);

        //Hooks
        buisness_img = findViewById(R.id.bak_buisness_img);
        buisness_img2 = findViewById(R.id.bak_buisness_img2);
        buisness_img3 = findViewById(R.id.bak_buisness_img3);
        buisness_img4 = findViewById(R.id.bak_buisness_img4);


        buisness_title = findViewById(R.id.bak_buisness_title);
        buisness_title2 = findViewById(R.id.bak_buisness_title2);
        buisness_title3 = findViewById(R.id.bak_buisness_title3);
        buisness_title4 = findViewById(R.id.bak_buisness_title4);



        // craquedecreme CLICK LISTENER
        buisness_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String craquedecreme = "http://craquedecreme.com/";
                Uri webaddress = Uri.parse(craquedecreme);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String craquedecreme = "http://craquedecreme.com/";
                Uri webaddress = Uri.parse(craquedecreme);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        // nugateau CLICK LISTENER
        buisness_img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nugateau = "https://www.nugateau.com/";
                Uri webaddress = Uri.parse(nugateau);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nugateau = "https://www.nugateau.com/";
                Uri webaddress = Uri.parse(nugateau);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        // Venezia CLICK LISTENER
        buisness_img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String venezia = "https://veneziabakery.ca/";
                Uri webaddress = Uri.parse(venezia);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String venezia = "https://veneziabakery.ca/";
                Uri webaddress = Uri.parse(venezia);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

        // millie CLICK LISTENER
        buisness_img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String millie = "https://milliedesserts.com/";
                Uri webaddress = Uri.parse(millie);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        buisness_title4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String millie = "https://milliedesserts.com/";
                Uri webaddress = Uri.parse(millie);

                Intent intent = new Intent(Intent.ACTION_VIEW, webaddress);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });
    }
}