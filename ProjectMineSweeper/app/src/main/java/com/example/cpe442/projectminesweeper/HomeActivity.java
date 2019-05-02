package com.example.cpe442.projectminesweeper;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    Typeface fa_brands, fa_solid;
    Button btn_sign_in, btn_play;
    TextView LOGO;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        fa_brands = Typeface.createFromAsset(getAssets(),
                "Font/fa-brands-400.ttf");
        fa_solid = Typeface.createFromAsset(getAssets(),
                "Font/fa-solid-900.ttf");

        LOGO = findViewById(R.id.logo);
        LOGO.setTypeface(fa_solid);

        btn_play = findViewById(R.id.btn_play);
        btn_play.setTypeface(fa_solid);

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_in.setTypeface(fa_brands);


        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_play = new Intent(HomeActivity.this,
                        PlayActivity.class);
                startActivity(intent_play);
            }
        });

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_sign_in = new Intent(HomeActivity.this,
                        SignInActivity.class);
                startActivity(intent_sign_in);
            }
        });

    }
}
