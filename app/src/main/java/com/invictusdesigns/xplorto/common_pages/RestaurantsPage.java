package com.invictusdesigns.xplorto.common_pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.invictusdesigns.xplorto.R;
import com.invictusdesigns.xplorto.restaurant_types.Caribbean;
import com.invictusdesigns.xplorto.restaurant_types.Indian;

public class RestaurantsPage extends AppCompatActivity {

    CardView firstcard, thirdcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_restaurants_page);

        firstcard = findViewById(R.id.firstcard);
        thirdcard = findViewById(R.id.thirdcard);

        firstcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Indian.class);
                startActivity(intent);
            }
        });

        thirdcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Caribbean.class);
                startActivity(intent);
            }
        });
    }
}