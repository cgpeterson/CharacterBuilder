package com.example.cbandoid;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProfileActivity extends AppCompatActivity
{

    ExpandableListView expand;
    TextView Submenutitle;
    List<String> chargroup;
    HashMap<String, List<String>> charitem;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_screen);
        Submenutitle=findViewById(R.id.submenutitle);
        Submenutitle.setText("Profile");

        expand=findViewById(R.id.expandedlist);
        chargroup = new ArrayList<>();
        charitem = new HashMap<>();
        ListData();

    }

    private void ListData()
    {

    }
}