package com.example.cbandoid;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button LoadCharacter;
    Button DiceRoller;
    Button CharacterCreate;
    ImageView pmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        LoadCharacter=findViewById(R.id.CharNameButton);
        DiceRoller=findViewById(R.id.DiceRollButton);
        CharacterCreate=findViewById(R.id.CreateNewCharButton);
        pmenu=findViewById(R.id.mainpopupbutton);

        DiceRoller.setOnClickListener(v ->{
            startActivity(new Intent(MainActivity.this, RollerActivity.class));
        });

        CharacterCreate.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ExpertCreateChar.class));
        });

        pmenu.setOnClickListener(this::showPopMenu);
    }

    private void showPopMenu(View v) {
        PopupMenu popMenu = new PopupMenu(MainActivity.this, v);
        popMenu.getMenuInflater().inflate(R.menu.popup_menu,popMenu.getMenu());
        popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.popup_profile) {
                    startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                }
                if(item.getItemId() == R.id.popup_help) {
                    startActivity(new Intent(MainActivity.this, HelpActivity.class));
                }
                if(item.getItemId() == R.id.popup_settings) {
                    //Placeholder code
                    Toast.makeText(MainActivity.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popMenu.show();
    }

    public Button GetCharNameButton()
    {
        return LoadCharacter;
    }

}
