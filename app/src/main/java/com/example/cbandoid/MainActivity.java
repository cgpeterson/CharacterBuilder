package com.example.cbandoid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button DiceRoller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        DiceRoller=findViewById(R.id.DiceRollButton);

        DiceRoller.setOnClickListener(v ->{
            RollerActivity roller = new RollerActivity();
            startActivity(new Intent(MainActivity.this, RollerActivity.class));
        });
    }

}
