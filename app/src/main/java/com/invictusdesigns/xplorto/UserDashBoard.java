package com.invictusdesigns.xplorto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserDashBoard extends AppCompatActivity {

    ImageView pic1, pic2, pic3, pic4, pic5;
    TextView click1, click2, click3, click4, click5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dash_board);


        //Hooks
        pic1 = findViewById(R.id.pic1);
        pic2 = findViewById(R.id.pic2);
        pic3 = findViewById(R.id.pic3);
        pic4 = findViewById(R.id.pic4);
        pic5 = findViewById(R.id.pic5);
        click1 = findViewById(R.id.click1);
        click2 = findViewById(R.id.click2);
        click3 = findViewById(R.id.click3);
        click4 = findViewById(R.id.click4);
        click5 = findViewById(R.id.click5);


        //ON Click Listeners Restaurant Page
        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RestaurantsPage.class);
                startActivity(intent);
            }
        });
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RestaurantsPage.class);
                startActivity(intent);
            }
        });
        //ON Click Listerner Bakery Page
        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BakeryPage.class);
                startActivity(intent);
            }
        });
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BakeryPage.class);
                startActivity(intent);
            }
        });
        //On Click Listener Bar Page
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BarPage.class);
                startActivity(intent);
            }
        });
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BarPage.class);
                startActivity(intent);
            }
        });
        //On Click Listener Fast Food
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FastFoodPage.class);
                startActivity(intent);
            }
        });
        click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FastFoodPage.class);
                startActivity(intent);
            }
        });
        //On Click Listener Ice Cream
        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IceCreamPage.class);
                startActivity(intent);
            }
        });
        click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IceCreamPage.class);
                startActivity(intent);
            }
        });


    }
}