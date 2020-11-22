package com.example.cbandoid;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class HelpActivity extends AppCompatActivity {
    TextView codydis;
    TextView dylandis;
    TextView Submenutitle;
    ImageView Back;
    ImageView pmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);

        codydis=findViewById(R.id.codydiscord);
        dylandis=findViewById(R.id.dylandiscord);
        pmenu=findViewById(R.id.popupbutton);
        Submenutitle=findViewById(R.id.submenutitle);
        Submenutitle.setText("Help");
        TextView Here = (TextView) findViewById(R.id.linktext);
        Here.setPaintFlags(Here.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        Here.setMovementMethod(LinkMovementMethod.getInstance());
        Back=findViewById(R.id.exitbutton);

        pmenu.setOnClickListener(this::showPopMenu);

        Back.setOnClickListener(v -> {
            startActivity(new Intent(HelpActivity.this, MainActivity.class));});

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
        int subText;
        if (screenInch >= 6)
        {
            textMega = width/20;
            textTitle = width/30;
            subText = width/35;
        }
        else if (screenInch <= 6 && screenInch >= 5)
        {
            textMega = width/35;
            textTitle = width/55;
            subText = width/52;
        }
        else
        {
            textMega = width/35;
            textTitle = width/50;
            subText = width/52;
        }

        codydis.setTextSize(subText);
        dylandis.setTextSize(subText);

    }

    //Redkona server: https://discord.gg/zn3UC6vGHb
    private void showPopMenu(View v) {
        PopupMenu popMenu = new PopupMenu(HelpActivity.this, v);
        popMenu.getMenuInflater().inflate(R.menu.popup_menu, popMenu.getMenu());
        popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.popup_profile) {
                    startActivity(new Intent(HelpActivity.this, ProfileActivity.class));
                }
                if (item.getItemId() == R.id.popup_help) {
                    Toast.makeText(HelpActivity.this, "You are already in Help", Toast.LENGTH_SHORT).show();

                }
                if (item.getItemId() == R.id.popup_settings) {
                    //Placeholder code
                    Toast.makeText(HelpActivity.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popMenu.show();
    }
}