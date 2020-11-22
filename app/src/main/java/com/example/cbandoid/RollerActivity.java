package com.example.cbandoid;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RollerActivity extends AppCompatActivity {

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
    TextView Submenutitle;
    TextView numDiceTitle;
    TextView numSidesTitle;
    TextView dTitle;
    TextView sidesTitle;
    TextView rollResults;
    ImageView Back;
    ImageView pmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roller);
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
        Submenutitle=findViewById(R.id.submenutitle);
        Submenutitle.setText("Dice Roller");
        Back=findViewById(R.id.exitbutton);
        pmenu=findViewById(R.id.popupbutton);
        numDiceTitle =findViewById(R.id.NumDiceTitle);
        numSidesTitle =findViewById(R.id.NumSidesTitle);
        dTitle=findViewById(R.id.DTitle);
        sidesTitle=findViewById(R.id.SidesTitle);
        rollResults=findViewById(R.id.RollResultsTitle);
        DisplayMetrics display = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(display);
        int height = display.heightPixels;
        int width = display.widthPixels;
        double widthInch = Math.pow(display.widthPixels/display.xdpi,2);
        double heightInch = Math.pow(display.heightPixels/display.ydpi,2);
        double screenInch = Math.sqrt(widthInch+heightInch);
        screenInch =  (double)Math.round(screenInch * 10) / 10;

        int textMega;
        int textTitle;
        int textEdit;
        if (screenInch >= 6)
        {
            textMega = width/20;
            textTitle = width/30;
            textEdit = width/35;
        }
        if (screenInch <= 6 && screenInch >= 5)
        {
            textMega = width/35;
            textTitle = width/55;
            textEdit = width/52;
        }
        else
        {
            textMega = width/35;
            textTitle = width/50;
            textEdit = width/52;
        }
        numDiceTitle.setTextSize(textTitle);
        numSidesTitle.setTextSize(textTitle);
        numTxt.setTextSize(textEdit);
        sidesTxt.setTextSize(textEdit);
        dTitle.setTextSize(textEdit);
        sidesTitle.setTextSize(textEdit);
        mod1.setTextSize(textEdit);
        mod2.setTextSize(textEdit);
        mod3.setTextSize(textEdit);
        modTxt1.setTextSize(textEdit);
        modTxt2.setTextSize(textEdit);
        modTxt3.setTextSize(textEdit);
        rollResults.setTextSize(textMega);
        //pixel 3 xl = 6.89
        //nexus 7 = 9.06
        //nexus

        //Adapted from: https://stackoverflow.com/questions/4743116/get-screen-width-and-height-in-android#:~:text=Display%20display%20%3D%20getWindowManager().,size)%3B%20int%20width%20%3D%20size.
        //Also adapted from: https://stackoverflow.com/questions/2193457/is-there-a-way-to-determine-android-physical-screen-height-in-cm-or-inches

        buttonroller.setOnClickListener(v -> {
            roller.SetNum(Integer.parseInt(numTxt.getText().toString()));
            roller.SetSides(Integer.parseInt(sidesTxt.getText().toString()));
            roller.Rolling();
            int Total = roller.GetSum();
            StringBuilder result = new StringBuilder(roller.GetNum() + "d" + roller.GetSides() + " (" );
            for (int i = 0; i < roller.GetNum(); i++)
            {
                result.append(roller.GetRolls(i));
                if (i < roller.GetNum() - 1)
                    result.append(", ");
            }

            result.append(") = ").append(roller.GetSum());

            try
            {
                Integer.parseInt(mod1.getText().toString());
            }   catch (NumberFormatException e)
            {
                mod1.setText("0");
            }

            if (Integer.parseInt(mod1.getText().toString()) != 0)
            {
                if(Integer.parseInt(mod1.getText().toString()) > 0)
                    result.append("+");
                result.append(mod1.getText());
                Total += Integer.parseInt(mod1.getText().toString());
                if (modTxt1.length() > 0)
                    result.append(" ").append(modTxt1.getText());
            }

            try
            {
                Integer.parseInt(mod2.getText().toString());
            }   catch (NumberFormatException e)
            {
                mod2.setText("0");
            }

            if (Integer.parseInt(mod2.getText().toString()) != 0)
            {
                if(Integer.parseInt(mod2.getText().toString()) > 0)
                    result.append("+");
                result.append(mod2.getText());
                Total += Integer.parseInt(mod2.getText().toString());
                if (modTxt2.length() > 0)
                    result.append(" ").append(modTxt2.getText());
            }

            try
            {
                Integer.parseInt(mod3.getText().toString());
            }   catch (NumberFormatException e)
            {
                mod3.setText("0");
            }

            if (Integer.parseInt(mod3.getText().toString()) != 0)
            {
                if(Integer.parseInt(mod3.getText().toString()) > 0)
                    result.append("+");
                result.append(mod3.getText());
                Total += Integer.parseInt(mod3.getText().toString());
                if (modTxt3.length() > 0)
                    result.append(" ").append(modTxt3.getText());
            }

            result.append(" = Total: ").append(Total);
            result.append("\n");
            //Scrollbar code\/
            resultsTxt.setMovementMethod((new ScrollingMovementMethod()));
            result.append(resultsTxt.getText());
            resultsTxt.setText(result);
        });

        Back.setOnClickListener(v -> {
            startActivity(new Intent(RollerActivity.this, MainActivity.class));
    });

        pmenu.setOnClickListener(this::showPopMenu);
    }

    private void showPopMenu(View v) {
        PopupMenu popMenu = new PopupMenu(RollerActivity.this, v);
        popMenu.getMenuInflater().inflate(R.menu.popup_menu,popMenu.getMenu());
        popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.popup_profile) {
                    startActivity(new Intent(RollerActivity.this, ProfileActivity.class));
                }
                if(item.getItemId() == R.id.popup_help) {
                    startActivity(new Intent(RollerActivity.this, HelpActivity.class));
                }
                if(item.getItemId() == R.id.popup_settings) {
                    //Placeholder code
                    Toast.makeText(RollerActivity.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popMenu.show();
    }
}