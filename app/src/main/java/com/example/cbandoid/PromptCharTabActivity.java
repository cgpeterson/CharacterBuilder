package com.example.cbandoid;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cbandoid.ui.main.SectionsPagerAdapter;

public class PromptCharTabActivity extends AppCompatActivity {

    TextView Submenutitle;
    ImageView Back;
    ImageView pmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt_char_tab);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        Submenutitle=findViewById(R.id.submenutitle);
        Submenutitle.setText("Character Sheet");
        Back=findViewById(R.id.exitbutton);
        pmenu=findViewById(R.id.popupbutton);

        Back.setOnClickListener(v -> {
            startActivity(new Intent(PromptCharTabActivity.this, MainActivity.class));
        });

        pmenu.setOnClickListener(this::showPopMenu);
    }
    private void showPopMenu(View v) {
        PopupMenu popMenu = new PopupMenu(PromptCharTabActivity.this, v);
        popMenu.getMenuInflater().inflate(R.menu.popup_menu, popMenu.getMenu());
        popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.popup_profile) {
                    startActivity(new Intent(PromptCharTabActivity.this, ProfileActivity.class));
                }
                if(item.getItemId() == R.id.popup_help) {
                    startActivity(new Intent(PromptCharTabActivity.this, HelpActivity.class));
                }
                if(item.getItemId() == R.id.popup_settings) {
                    //Placeholder code
                    Toast.makeText(PromptCharTabActivity.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popMenu.show();
    }
}