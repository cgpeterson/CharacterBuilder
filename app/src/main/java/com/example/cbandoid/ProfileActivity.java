package com.example.cbandoid;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileActivity extends AppCompatActivity {

    ExpandableListView expand;
    ExpandableListAdapter expandAdapt;


    TextView Submenutitle;
    List<String> ruleSet;
    Map<String, List<String>> characters;
    ImageView Back;
    ImageView pmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_screen);
        Submenutitle = findViewById(R.id.submenutitle);
        Submenutitle.setText("Profile");
        pmenu = findViewById(R.id.popupbutton);


        expand = (ExpandableListView) findViewById(R.id.expandedlist);
        ListData();

        expandAdapt = new ProfileAdapter(this, ruleSet, characters);
        expand.setAdapter(expandAdapt);


        Back = findViewById(R.id.exitbutton);
        pmenu.setOnClickListener(this::showPopMenu);

        Back.setOnClickListener(v -> {
            startActivity(new Intent(ProfileActivity.this, MainActivity.class));
        });

    }

    private void showPopMenu(View v) {
        PopupMenu popMenu = new PopupMenu(ProfileActivity.this, v);
        popMenu.getMenuInflater().inflate(R.menu.popup_menu, popMenu.getMenu());
        popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.popup_profile) {
                    Toast.makeText(ProfileActivity.this, "You are already in Profile", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.popup_help) {
                    startActivity(new Intent(ProfileActivity.this, HelpActivity.class));
                }
                if (item.getItemId() == R.id.popup_settings) {
                    //Placeholder code
                    Toast.makeText(ProfileActivity.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popMenu.show();
    }

    private void ListData() {
        ruleSet = new ArrayList<>();
        characters = new HashMap<>();
        ruleSet.add("Champion Forge");
        List<String> champForge = new ArrayList<>(Load());

        characters.put(ruleSet.get(0), champForge);
    }

    //ToDo: Load for specific characters
    private List<String> Load() {
        List<String> champForge = new ArrayList<>();
        try {
            FileInputStream input = openFileInput("settings.txt");
            StringBuilder name = new StringBuilder();

            int i = input.read();
            while (i != -1) {
                //ToDo: find more flexible solution
                if (i != 0) {
                    name.append((char) i);
                } else {
                    champForge.add(name.toString());
                    name = new StringBuilder();
                }
                i = input.read();
            }

            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
            e.printStackTrace();
            champForge.add("Character 1");
            champForge.add("Character 2");
            champForge.add("Character 3");
        }
        return champForge;
    }
}