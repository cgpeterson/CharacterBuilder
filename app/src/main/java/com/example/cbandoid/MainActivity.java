package com.example.cbandoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    Button buttonroller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ToDo Roller
        Roller roller = new Roller(1,6);
        txt1=(TextView) findViewById(R.id.RollOutput);
        buttonroller=(Button) findViewById(R.id.buttonRoller);

        buttonroller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roller.Rolling();
                txt1.append("\n" + roller.GetNum() + "d" + roller.GetSides() + " = (" + roller.GetRolls() + ") Total = " + roller.GetSum());
            }
        });
    }
}