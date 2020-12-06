package com.example.cbandoid;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class CharSheetChoice extends AppCompatActivity
{

    TextView Submenutitle;
    ImageView Back;
    ImageView pmenu;
    Button expertView;
    Button guidedView;
    TextView expertDescript;
    TextView guidedDescript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charsheet_choice);
        Submenutitle = findViewById(R.id.submenutitle);
        Submenutitle.setText("View Select");
        Back = findViewById(R.id.exitbutton);
        pmenu = findViewById(R.id.popupbutton);

        expertView = findViewById(R.id.ExpertViewButton);
        guidedView = findViewById(R.id.GuidedCharButton);
        expertDescript = findViewById(R.id.ExpertDescript);
        guidedDescript = findViewById(R.id.GuidedDescript);

        expertView.setOnClickListener(v -> {
            startActivity(new Intent(CharSheetChoice.this, ExpertCreateChar.class));
        });

        guidedView.setOnClickListener(v -> {
            startActivity(new Intent (CharSheetChoice.this, PromptCharTabActivity.class));
        });


        //Resize code
        DisplayMetrics display = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(display);
        int width = display.widthPixels;
        double widthInch = Math.pow(display.widthPixels / display.xdpi, 2);
        double heightInch = Math.pow(display.heightPixels / display.ydpi, 2);
        double screenInch = Math.sqrt(widthInch + heightInch);
        screenInch = (double) Math.round(screenInch * 10) / 10;


        int textDes;
        int textBut;

        if (screenInch >= 6.8) {
            textDes = width / 35;
            textBut = width / 35;
        } else if (screenInch < 6.8 && screenInch >= 5) {
            textDes = width / 55;
            textBut = width / 55;
        } else {
            textDes = width / 50;
            textBut = width / 42;
        }

        expertDescript.setTextSize(textDes);
        guidedDescript.setTextSize(textDes);
        expertView.setTextSize(textBut);
        guidedView.setTextSize(textBut);

        Back.setOnClickListener(v -> {
            startActivity(new Intent(CharSheetChoice.this, MainActivity.class));
        });

        pmenu.setOnClickListener(this::showPopMenu);
    }

    private void showPopMenu(View v)
    {
        PopupMenu popMenu = new PopupMenu(CharSheetChoice.this, v);
        popMenu.getMenuInflater().inflate(R.menu.popup_menu, popMenu.getMenu());
        popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.popup_profile) {
                    startActivity(new Intent(CharSheetChoice.this, ProfileActivity.class));
                }
                if (item.getItemId() == R.id.popup_help) {
                    startActivity(new Intent(CharSheetChoice.this, HelpActivity.class));
                }
                if (item.getItemId() == R.id.popup_settings) {
                    //Placeholder code
                    Toast.makeText(CharSheetChoice.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popMenu.show();
    }
}