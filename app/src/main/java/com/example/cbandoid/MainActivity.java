package com.example.cbandoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultsTxt;
    Button buttonroller;
    TextView numTxt;
    TextView sidesTxt;
    TextView mod1;
    TextView mod2;
    TextView mod3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ToDo Roller
        Roller roller = new Roller(1,6);
        resultsTxt=findViewById(R.id.RollOutput);
        buttonroller=findViewById(R.id.buttonRoller);
        numTxt=findViewById(R.id.NumTxt);
        sidesTxt=findViewById(R.id.SidesTxt);
        mod1=findViewById(R.id.Mod1);
        mod2=findViewById(R.id.Mod2);
        mod3=findViewById(R.id.Mod3);

        numTxt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus)
                    roller.SetNum(Integer.parseInt(numTxt.getText().toString()));
            }
        });

        sidesTxt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus)
                    roller.SetSides(Integer.parseInt(sidesTxt.getText().toString()));
            }
        });

        buttonroller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roller.Rolling();
                resultsTxt.append("\n" + roller.GetNum() + "d" + roller.GetSides() + " = (" );
                for (int i = 0; i < roller.GetNum(); i++)
                {
                    resultsTxt.append(String.valueOf(roller.GetRolls(i)));
                    if (i < roller.GetNum() - 1)
                        resultsTxt.append(", ");
                }

                resultsTxt.append(") " + roller.GetSum());
            }
        });
    }
}