package com.example.cpe442.projectminesweeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewgameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newgame);

        //  Button create_room = (Button)findViewById(R.id.btn_create);
        Button search_rooms = (Button)findViewById(R.id.btn_search);

       /* create_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main = new Intent(MainActivity.this,act_create.class);

                startActivity(intent_main);

            }
        }*/


        search_rooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main = new Intent(NewgameActivity.this,SearchRoomActivity.class);
                startActivity(intent_main);

            }
        });
    }
}
