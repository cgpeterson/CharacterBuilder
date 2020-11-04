package com.example.cbandoid;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
    TextView codydis;
    TextView dylandis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);

        codydis=findViewById(R.id.codydiscord);
        dylandis=findViewById(R.id.dylandiscord);
    }
}