package com.example.cpe442.projectminesweeper;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;


public class SignInActivity extends AppCompatActivity {

//    Typeface fa_brands, fa_solid;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Windows Screen
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        fa_brands = Typeface.createFromAsset(getAssets(),
//                "Font/fa-brands-400.ttf");
//        fa_solid = Typeface.createFromAsset(getAssets(),
//                "Font/fa-solid-900.ttf");

        SignInButton sign_in_google = findViewById(R.id.btn_sign_in_google);

        LoginButton sign_in_facebook = findViewById(R.id.btn_sign_in_facebook);


        sign_in_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_google_login = new Intent(SignInActivity.this,
                        GoogleSignInActivity.class);
                startActivity(intent_google_login);
            }
        });

        sign_in_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_facebook_login = new Intent(SignInActivity.this,
                        FacebookSignInActivity.class);
                startActivity(intent_facebook_login);
            }
        });


    }
}