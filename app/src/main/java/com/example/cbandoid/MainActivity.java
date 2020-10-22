package com.example.cbandoid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView resultsTxt;
    Button buttonroller;
    TextView numTxt;
    TextView sidesTxt;
    TextView mod1;
    TextView mod2;
    TextView mod3;
    TextView modTxt1;
    TextView modTxt2;
    TextView modTxt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Roller roller = new Roller(1,6);
        resultsTxt=findViewById(R.id.RollOutput);
        buttonroller=findViewById(R.id.buttonRoller);
        numTxt=findViewById(R.id.NumTxt);
        numTxt.setText("1");
        sidesTxt=findViewById(R.id.SidesTxt);
        sidesTxt.setText("6");
        mod1=findViewById(R.id.Mod1);
        mod1.setText("0");
        mod2=findViewById(R.id.Mod2);
        mod2.setText("0");
        mod3=findViewById(R.id.Mod3);
        mod3.setText("0");
        modTxt1=findViewById(R.id.ModTxt1);
        modTxt2=findViewById(R.id.ModTxt2);
        modTxt3=findViewById(R.id.ModTxt3);

        numTxt.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus)
                roller.SetNum(Integer.parseInt(numTxt.getText().toString()));
        });

        sidesTxt.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus)
                roller.SetSides(Integer.parseInt(sidesTxt.getText().toString()));
        });

        buttonroller.setOnClickListener(v -> {
            roller.Rolling();
            int Total = roller.GetSum();
            resultsTxt.append("\n" + roller.GetNum() + "d" + roller.GetSides() + " (" );
            for (int i = 0; i < roller.GetNum(); i++)
            {
                resultsTxt.append(String.valueOf(roller.GetRolls(i)));
                if (i < roller.GetNum() - 1)
                    resultsTxt.append(", ");
            }

            resultsTxt.append(") = " + roller.GetSum());

            if (Integer.parseInt(mod1.getText().toString()) != 0)
            {
                resultsTxt.append(" + " + mod1.getText());
                Total += Integer.parseInt(mod1.getText().toString());
                if (modTxt1.length() > 0)
                    resultsTxt.append(" " + modTxt1.getText());
            }

            if (Integer.parseInt(mod2.getText().toString()) != 0)
            {
                resultsTxt.append(" + " + mod2.getText());
                Total += Integer.parseInt(mod2.getText().toString());
                if (modTxt2.length() > 0)
                    resultsTxt.append(" " + modTxt2.getText());
            }

            if (Integer.parseInt(mod3.getText().toString()) != 0)
            {
                resultsTxt.append(" + " + mod3.getText());
                Total += Integer.parseInt(mod3.getText().toString());
                if (modTxt3.length() > 0)
                    resultsTxt.append(" " + modTxt3.getText());
            }

            resultsTxt.append(" = Total: " + Total);
        });
    }
}