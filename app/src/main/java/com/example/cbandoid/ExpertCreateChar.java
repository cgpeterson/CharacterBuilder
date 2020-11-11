package com.example.cbandoid;

import android.graphics.Color;
import android.os.Bundle;
import android.os.strictmode.SqliteObjectLeakedViolation;
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

    TextView AModTitle;
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
    EditText[] abilities;
    TextView[] strDerived = new TextView[2];
    TextView[] dexDerived = new TextView[4];
    TextView[] conDerived = new TextView[1];
    TextView[] intDerived = new TextView[5];
    TextView[] wisDerived = new TextView[6];
    TextView[] chaDerived = new TextView[4];
    TextView[][] abilitiesDerived = {strDerived,dexDerived,conDerived,intDerived,wisDerived,chaDerived};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_sheet);
        Submenutitle=findViewById(R.id.submenutitle);
        Submenutitle.setText("Character Sheet");

        //Define Variables
        AModTitle=findViewById(R.id.AbilityModTitle);
        STR=findViewById(R.id.STRABox);
        DEX=findViewById(R.id.DEXABox);
        CON=findViewById(R.id.CONABox);
        INT=findViewById(R.id.INTABox);
        WIS=findViewById(R.id.WISABox);
        CHA=findViewById(R.id.CHAABox);
        abilities = new EditText[] {STR,DEX,CON,INT,WIS,CHA};
        Class=findViewById(R.id.ClassSpin);
        Race=findViewById(R.id.RaceSpin);
        Size=findViewById(R.id.SizeSpin);
        strDerived[0]=findViewById(R.id.AthleticsAbility);
        strDerived[1]=findViewById(R.id.GrappleStrength);
        dexDerived[0]=findViewById(R.id.ReflexAction);
        dexDerived[1]=findViewById(R.id.AcrobaticsAbility);
        dexDerived[2]=findViewById(R.id.SleightHandAbility);
        dexDerived[3]=findViewById(R.id.StealthAbility);
        conDerived[0]=findViewById(R.id.FortAction);
        intDerived[0]=findViewById(R.id.ArcanaAbility);
        intDerived[1]=findViewById(R.id.HistoryAbility);
        intDerived[2]=findViewById(R.id.InvestigationAbility);
        intDerived[3]=findViewById(R.id.NatureAbility);
        intDerived[4]=findViewById(R.id.ReligionAbiltiy);
        wisDerived[0]=findViewById(R.id.WillAction);
        wisDerived[1]=findViewById(R.id.AnimalHandAbility);
        wisDerived[2]=findViewById(R.id.InsightAbility);
        wisDerived[3]=findViewById(R.id.MedicineAbility);
        wisDerived[4]=findViewById(R.id.PerceptionAbility);
        wisDerived[5]=findViewById(R.id.SurvivalAbility);
        chaDerived[0]=findViewById(R.id.DeceptionAbility);
        chaDerived[1]=findViewById(R.id.IntimidationAbility);
        chaDerived[2]=findViewById(R.id.PerformanceAbility);
        chaDerived[3]=findViewById(R.id.PersuasionAbility);
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
        STR.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus)
                    try {
                        Integer.parseInt(STR.getText().toString());
                    } catch (Exception e) {
                        STR.setText("0");
                    }

                    if (abilityCheck())
                    {
                        Derive();
                    }
            }
        });
        DEX.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus)
                    try {
                        Integer.parseInt(DEX.getText().toString());
                    } catch (Exception e) {
                        DEX.setText("0");
                    }
                if (abilityCheck())
                {
                    Derive();
                }
            }
        });
        CON.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus)
                    try {
                        Integer.parseInt(CON.getText().toString());
                    } catch (Exception e) {
                        CON.setText("0");
                    }
                if (abilityCheck())
                {
                    Derive();
                }
            }
        });
        INT.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus)
                    try {
                        Integer.parseInt(INT.getText().toString());
                    } catch (Exception e) {
                        INT.setText("0");
                    }
                if (abilityCheck())
                {
                    Derive();
                }
            }
        });
        WIS.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus)
                    try {
                        Integer.parseInt(WIS.getText().toString());
                    } catch (Exception e) {
                        WIS.setText("0");
                    }
                if (abilityCheck())
                {
                    Derive();
                }
            }
        });
        CHA.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus)
                    try {
                        Integer.parseInt(CHA.getText().toString());
                    } catch (Exception e) {
                        CHA.setText("0");
                    }
                if (abilityCheck())
                {
                    Derive();
                }
            }
        });
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
                        Toast toast1 = Toast.makeText(getApplicationContext(),"Human; Cha+, Dex+, Con-",Toast.LENGTH_LONG);
                        toast1.show();
                        abilityCheck();
                        break;
                    case 2:
                        //placeholder
                        Toast toast2 = Toast.makeText(getApplicationContext(),"Elf; Int+, Dex+, Str-",Toast.LENGTH_LONG);
                        toast2.show();
                        abilityCheck();
                        break;
                    case 3:
                        //placeholder
                        Toast toast3 = Toast.makeText(getApplicationContext(),"Dwarf; Wis+, Con+, Cha-",Toast.LENGTH_LONG);
                        toast3.show();
                        abilityCheck();
                        break;
                    case 4:
                        //placeholder
                        Toast toast4 = Toast.makeText(getApplicationContext(),"Orc; Str+, Con+, Int-",Toast.LENGTH_LONG);
                        toast4.show();
                        abilityCheck();
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

    private boolean abilityCheck()
    {
        int strMax = 4;
        int strMin = -2;
        int dexMax = 4;
        int dexMin = -2;
        int conMax = 4;
        int conMin = -2;
        int intMax = 4;
        int intMin = -2;
        int wisMax = 4;
        int wisMin = -2;
        int chaMax = 4;
        int chaMin = -2;

        int pointMax = 7;
        switch (Race.getSelectedItemPosition())
        {
            case 1:
                //Racial Bonus
                chaMax++;
                chaMin++;
                dexMax++;
                dexMin++;
                //Racial Minus
                conMax--;
                conMin--;
                break;
            case 2:
                //Racial Bonus
                intMax++;
                intMin++;
                dexMax++;
                dexMin++;
                //Racial Minus
                strMax--;
                strMin--;
                break;
            case 3:
                //Racial Bonus
                wisMax++;
                wisMin++;
                conMax++;
                conMin++;
                //Racial Minus
                chaMax--;
                chaMin--;
                break;
            case 4:
                //Racial Bonus
                strMax++;
                strMin++;
                conMax++;
                conMin++;
                //Racial Minus
                intMax--;
                intMin--;
                break;
        }

        if (Integer.parseInt(STR.getText().toString()) > strMax)
            STR.setText(String.valueOf(strMax));
        if (Integer.parseInt(STR.getText().toString()) < strMin)
            STR.setText(String.valueOf(strMin));
        if (Integer.parseInt(DEX.getText().toString()) > dexMax)
            DEX.setText(String.valueOf(dexMax));
        if (Integer.parseInt(DEX.getText().toString()) < dexMin)
            DEX.setText(String.valueOf(dexMin));
        if (Integer.parseInt(CON.getText().toString()) > conMax)
            CON.setText(String.valueOf(conMax));
        if (Integer.parseInt(CON.getText().toString()) < conMin)
            CON.setText(String.valueOf(conMin));
        if (Integer.parseInt(INT.getText().toString()) > intMax)
            INT.setText(String.valueOf(intMax));
        if (Integer.parseInt(INT.getText().toString()) < intMin)
            INT.setText(String.valueOf(intMin));
        if (Integer.parseInt(WIS.getText().toString()) > wisMax)
            WIS.setText(String.valueOf(wisMax));
        if (Integer.parseInt(WIS.getText().toString()) < wisMin)
            WIS.setText(String.valueOf(wisMin));
        if (Integer.parseInt(CHA.getText().toString()) > chaMax)
            CHA.setText(String.valueOf(chaMax));
        if (Integer.parseInt(CHA.getText().toString()) < chaMin)
            CHA.setText(String.valueOf(chaMin));


        int sumPoints = Integer.parseInt(STR.getText().toString()) + Integer.parseInt(DEX.getText().toString()) + Integer.parseInt(CON.getText().toString()) + Integer.parseInt(INT.getText().toString()) + Integer.parseInt(WIS.getText().toString()) + Integer.parseInt(CHA.getText().toString());

        if (sumPoints > pointMax)
        {
            Toast toast = Toast.makeText(getApplicationContext(),"Over Spent",Toast.LENGTH_LONG);
            toast.show();
            AModTitle.setTextColor(Color.parseColor("#FF0000"));
        } else if (sumPoints == pointMax){
            AModTitle.setTextColor(Color.parseColor("#FFFFFF"));
            return true;
        } else {
            AModTitle.setTextColor(Color.parseColor("#FFFFFF"));
        }

        return false;
    }

    private void Derive()
    {
        for (int i = 0; i < abilitiesDerived.length; i++)
        {
            for (int j = 0; j < abilitiesDerived[i].length; j++)
            {
                abilitiesDerived[i][j].setText(abilities[i].getText().toString());
            }
        }
    }
}
