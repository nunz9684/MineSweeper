package com.example.cpe442.projectminesweeper;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class PlayActivity extends AppCompatActivity {

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


    }
}




