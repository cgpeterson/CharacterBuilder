package com.example.cbandoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SubmenuActivity extends AppCompatActivity {

ImageView Back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topbarsub);

        Back=findViewById(R.id.exitbutton);

        Back.setOnClickListener(v -> {
            startActivity(new Intent(SubmenuActivity.this, MainActivity.class));
        });
    }
}
