package com.example.cbandoid;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProfileActivity extends AppCompatActivity
{

    ExpandableListView expand;
    TextView Submenutitle;
    List<String> chargroup;
    HashMap<String, List<String>> charitem;
    ImageView Back;
    ImageView pmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_screen);
        Submenutitle=findViewById(R.id.submenutitle);
        Submenutitle.setText("Profile");
        pmenu=findViewById(R.id.popupbutton);


        expand=findViewById(R.id.expandedlist);
        chargroup = new ArrayList<>();
        charitem = new HashMap<>();
        ListData();

        Back=findViewById(R.id.exitbutton);
        pmenu.setOnClickListener(this::showPopMenu);

        Back.setOnClickListener(v -> {
            startActivity(new Intent(ProfileActivity.this, MainActivity.class));});

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

    private void ListData()
    {
        chargroup.add(getString(R.string.Dungeons_and_Dragons));
    }
}