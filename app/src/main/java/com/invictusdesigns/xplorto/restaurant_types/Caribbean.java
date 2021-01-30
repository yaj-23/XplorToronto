package com.invictusdesigns.xplorto.restaurant_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.invictusdesigns.xplorto.R;
import com.invictusdesigns.xplorto.common_pages.UserDashBoard;

public class Caribbean extends AppCompatActivity {
    ImageView to_dashboard,caribbean_buisness_img,caribbean_buisness_img2,caribbean_buisness_img3,caribbean_buisness_img4,caribbean_buisness_img5,caribbean_buisness_img6,caribbean_buisness_img7,caribbean_buisness_img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caribbean);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        to_dashboard=findViewById(R.id.to_dasboard);
        caribbean_buisness_img=findViewById(R.id.caribbean_buisness_img);
        caribbean_buisness_img2=findViewById(R.id.caribbean_buisness_img2);
        caribbean_buisness_img3=findViewById(R.id.caribbean_buisness_img3);
        caribbean_buisness_img4=findViewById(R.id.caribbean_buisness_img4);
        caribbean_buisness_img5=findViewById(R.id.caribbean_buisness_img5);
        caribbean_buisness_img6=findViewById(R.id.caribbean_buisness_img6);
        caribbean_buisness_img7=findViewById(R.id.caribbean_buisness_img7);
        caribbean_buisness_img8=findViewById(R.id.caribbean_buisness_img8);


        to_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserDashBoard.class);
                startActivity(intent);
            }
        });
    }
}