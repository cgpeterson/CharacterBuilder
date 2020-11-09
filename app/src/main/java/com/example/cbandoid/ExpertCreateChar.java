package com.example.cbandoid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExpertCreateChar extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView FortA;
    TextView RefA;
    TextView WillA;
    EditText STR;
    EditText DEX;
    EditText CON;
    EditText INT;
    EditText WIS;
    EditText CHA;
    Spinner Class;
    Spinner Level;
    Spinner Race;
    Spinner Size;
    TextView Submenutitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_sheet);
        Submenutitle=findViewById(R.id.submenutitle);
        Submenutitle.setText("Character Sheet");

        //Define Variables
        FortA=findViewById(R.id.FortAction);
        RefA=findViewById(R.id.ReflexAction);
        WillA=findViewById(R.id.WillAction);
        STR=findViewById(R.id.STRABox);
        DEX=findViewById(R.id.DEXABox);
        CON=findViewById(R.id.CONABox);
        INT=findViewById(R.id.INTABox);
        WIS=findViewById(R.id.WISABox);
        CHA=findViewById(R.id.CHAABox);
        Class=findViewById(R.id.ClassSpin);
        Race=findViewById(R.id.RaceSpin);
        Size=findViewById(R.id.SizeSpin);
        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this, R.array.Class_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter.createFromResource(this, R.array.Race_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> sizeAdapter = ArrayAdapter.createFromResource(this, R.array.Size_array, android.R.layout.simple_spinner_item);

        //Set Defaults
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Class.setAdapter(classAdapter);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Race.setAdapter(raceAdapter);
        sizeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Size.setAdapter(sizeAdapter);

        //Actions
        Class.setOnItemSelectedListener(this);
        Race.setOnItemSelectedListener(this);
        Size.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId())
        {
            case R.id.ClassSpin:
                switch (position)
                {
                    case 1:
                        //placeholder
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Cleric",Toast.LENGTH_LONG);
                        toast1.show();
                        break;
                    case 2:
                        //placeholder
                        Toast toast2 = Toast.makeText(getApplicationContext(),"Fighter",Toast.LENGTH_LONG);
                        toast2.show();
                        break;
                    case 3:
                        //placeholder
                        Toast toast3 = Toast.makeText(getApplicationContext(),"Wizard",Toast.LENGTH_LONG);
                        toast3.show();
                        break;
                    case 4:
                        //placeholder
                        Toast toast4 = Toast.makeText(getApplicationContext(),"Rogue",Toast.LENGTH_LONG);
                        toast4.show();
                        break;
                }
                break;
            case R.id.RaceSpin:
                switch (position)
                {
                    case 1:
                        //placeholder
                        Toast toast1 = Toast.makeText(getApplicationContext(),"Human",Toast.LENGTH_LONG);
                        toast1.show();
                        break;
                    case 2:
                        //placeholder
                        Toast toast2 = Toast.makeText(getApplicationContext(),"Elf",Toast.LENGTH_LONG);
                        toast2.show();
                        break;
                    case 3:
                        //placeholder
                        Toast toast3 = Toast.makeText(getApplicationContext(),"Dwarf",Toast.LENGTH_LONG);
                        toast3.show();
                        break;
                    case 4:
                        //placeholder
                        Toast toast4 = Toast.makeText(getApplicationContext(),"Orc",Toast.LENGTH_LONG);
                        toast4.show();
                        break;
                }
                break;
            case R.id.SizeSpin:
                switch (position)
                {
                    case 1:
                        //placeholder
                        Toast toast1 = Toast.makeText(getApplicationContext(),"Large",Toast.LENGTH_LONG);
                        toast1.show();
                        break;
                    case 2:
                        //placeholder
                        Toast toast2 = Toast.makeText(getApplicationContext(),"Medium",Toast.LENGTH_LONG);
                        toast2.show();
                        break;
                    case 3:
                        //placeholder
                        Toast toast3 = Toast.makeText(getApplicationContext(),"Small",Toast.LENGTH_LONG);
                        toast3.show();
                        break;
                }
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
