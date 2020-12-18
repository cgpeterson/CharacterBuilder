package com.example.cbandoid;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExpertCreateChar extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText CharName;
    EditText PlayName;
    EditText Age;
    EditText Sex;
    TextView tempModTitle;
    TextView strTitle;
    TextView dexTitle;
    TextView conTitle;
    TextView intTitle;
    TextView wisTitle;
    TextView chaTitle;
    TextView strSub;
    TextView dexSub;
    TextView conSub;
    TextView intSub;
    TextView wisSub;
    TextView chaSub;
    TextView hpTitle;
    TextView currHPTitle;
    EditText currHPBox;
    TextView acTitle;
    TextView acTotalTitle;
    TextView acTempTitle;
    EditText acTempBox;
    TextView savingThrowsTitle;
    TextView fortTitle;
    TextView reflexTitle;
    TextView willTitle;
    TextView fortTotal;
    TextView reflexTotal;
    TextView willTotal;
    TextView skillsTitle;
    TextView skillsTotalTitle;
    TextView skillsAbilityTitle;
    TextView skillsRankTitle;
    TextView totalSaveTitle;
    TextView baseSaveTitle;
    TextView abilitySaveTitle;
    TextView grappleTitle;
    TextView grappleBaseAttackBonusTitle;
    TextView grappleModifierTitle;
    TextView grappleStrengthTitle;
    TextView grappleSizeTitle;
    TextView grappleTotalTitle;
    TextView grappleTotal;
    TextView grappleStrength;
    TextView weaponsAttacksTitle;
    TextView dmgTitle;
    TextView typeTitle;
    TextView abilityModTitle;
    TextView FortBase;
    TextView RefBase;
    TextView WillBase;
    TextView attacksTitle;
    TextView baseAttackTitle;
    TextView AttackBase;
    TextView currencyTitle;
    TextView spTitle;
    TextView gpTitle;
    EditText spAmount;
    EditText gpAmount;
    TextView characterInventoryTitle;
    TextView characterBioTitle;
    EditText characterInventoryInput;
    EditText characterBioInput;
    EditText STR;
    EditText STRT;
    EditText DEX;
    EditText DEXT;
    EditText CON;
    EditText CONT;
    EditText INT;
    EditText INTT;
    EditText WIS;
    EditText WIST;
    EditText CHA;
    EditText CHAT;
    Spinner Class;
    EditText Level;
    Spinner Race;
    Spinner Size;
    Spinner[] WType = new Spinner[3];
    TextView HP;
    TextView AC;
    TextView gsizeMod;
    TextView gattackMod;
    TextView[] dmg = new TextView[3];
    TextView Submenutitle;
    ImageView Back;
    ImageView pmenu;
    EditText[] abilities;
    EditText[] SkillRanks = new EditText[18];
    TextView[] SkillTotals = new TextView[18];
    TextView[] SkillAbilities = new TextView[18];
    TextView[] SkillTitles = new TextView[18];
    TextView[] strDerived = new TextView[2];
    TextView[] dexDerived = new TextView[4];
    TextView[] conDerived = new TextView[1];
    TextView[] intDerived = new TextView[5];
    TextView[] wisDerived = new TextView[6];
    TextView[] chaDerived = new TextView[4];
    TextView[][] abilitiesDerived = {strDerived, dexDerived, conDerived, intDerived, wisDerived, chaDerived};
    EditText[] weaponAttackInput = new EditText[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_sheet);
        Submenutitle = findViewById(R.id.submenutitle);
        Submenutitle.setText(R.string.default_char_name);
        Back = findViewById(R.id.exitbutton);
        pmenu = findViewById(R.id.popupbutton);

        //Define Variables
        CharName = findViewById(R.id.CharNameEdit);
        PlayName = findViewById(R.id.PlayerNameEdit);
        Age = findViewById(R.id.AgeEditbox);
        Sex = findViewById(R.id.SexEdit);
        tempModTitle = findViewById(R.id.TempModTitle);
        strTitle = findViewById(R.id.STRTitle);
        dexTitle = findViewById(R.id.DEXTitle);
        conTitle = findViewById(R.id.CONTitle);
        intTitle = findViewById(R.id.INTTitle);
        wisTitle = findViewById(R.id.WISTitle);
        chaTitle = findViewById(R.id.CHATitle);
        strSub = findViewById(R.id.STRSub);
        dexSub = findViewById(R.id.DEXSub);
        conSub = findViewById(R.id.CONSub);
        intSub = findViewById(R.id.INTSub);
        wisSub = findViewById(R.id.WISSub);
        chaSub = findViewById(R.id.CHASub);
        hpTitle = findViewById(R.id.HPTitle);
        currHPTitle = findViewById(R.id.CurrHPTitle);
        currHPBox = findViewById(R.id.CurrHPBox);
        acTitle = findViewById(R.id.ACTitle);
        acTotalTitle = findViewById(R.id.ACTotalTitle);
        acTempTitle = findViewById(R.id.ACTempTitle);
        acTempBox = findViewById(R.id.ACTempBox);
        savingThrowsTitle = findViewById(R.id.SavingThrowsTitle);
        fortTitle = findViewById(R.id.FortTitle);
        reflexTitle = findViewById(R.id.ReflexTitle);
        willTitle = findViewById(R.id.WillTitle);
        skillsTitle = findViewById(R.id.SkillsTitle);
        skillsTotalTitle = findViewById(R.id.SkillsTotalTitle);
        skillsAbilityTitle = findViewById(R.id.SkillsAbilityTitle);
        skillsRankTitle = findViewById(R.id.SkillsRankTitle);
        totalSaveTitle = findViewById(R.id.TotalSaveTitle);
        baseSaveTitle = findViewById(R.id.BaseSaveTitle);
        abilitySaveTitle = findViewById(R.id.AbilitySaveTitle);
        abilityModTitle = findViewById(R.id.AbilityModTitle);
        fortTotal=findViewById(R.id.FortTotal);
        reflexTotal=findViewById(R.id.ReflexTotal);
        willTotal=findViewById(R.id.WillTotal);
        FortBase = findViewById(R.id.FortBase);
        RefBase = findViewById(R.id.ReflexBase);
        WillBase = findViewById(R.id.WillBase);
        attacksTitle = findViewById(R.id.AttacksTitle);
        baseAttackTitle = findViewById(R.id.BaseAttackTitle);
        AttackBase = findViewById(R.id.BaseAttackBox);
        grappleTitle = findViewById(R.id.GrappleTitle);
        grappleTotalTitle = findViewById(R.id.GrappleTotalTitle);
        grappleModifierTitle = findViewById(R.id.GrappleModifierTitle);
        grappleBaseAttackBonusTitle = findViewById(R.id.GrappleAttackBonusTitle);
        grappleStrengthTitle = findViewById(R.id.GrappleStrengthTitle);
        grappleSizeTitle = findViewById(R.id.GrappleSizeTitle);
        grappleTotal = findViewById(R.id.GrappleTotal);
        grappleStrength = findViewById(R.id.GrappleStrength);
        weaponsAttacksTitle = findViewById(R.id.WeaponsAttacksTitle);
        dmgTitle = findViewById(R.id.DMGTitle);
        typeTitle = findViewById(R.id.TypeTitle);
        characterInventoryTitle = findViewById(R.id.CharacterInventoryTitle);
        characterBioTitle = findViewById(R.id.CharacterBioTitle);
        characterInventoryInput = findViewById(R.id.CharacterInventoryInput);
        characterBioInput = findViewById(R.id.CharacterBioInput);
        weaponAttackInput[0] = findViewById(R.id.WeaponAttackInput);
        weaponAttackInput[1] = findViewById(R.id.WeaponAttackInput2);
        weaponAttackInput[2] = findViewById(R.id.WeaponAttackInput3);
        STR = findViewById(R.id.STRABox);
        DEX = findViewById(R.id.DEXABox);
        CON = findViewById(R.id.CONABox);
        INT = findViewById(R.id.INTABox);
        WIS = findViewById(R.id.WISABox);
        CHA = findViewById(R.id.CHAABox);
        STRT = findViewById(R.id.STRTBox);
        DEXT = findViewById(R.id.DEXTBox);
        CONT = findViewById(R.id.CONTBox);
        INTT = findViewById(R.id.INTTBox);
        WIST = findViewById(R.id.WISTBox);
        CHAT = findViewById(R.id.CHATBox);
        currencyTitle = findViewById(R.id.CurrencyTitle);
        spTitle = findViewById(R.id.SPTitle);
        gpTitle = findViewById(R.id.GPTitle);
        spAmount = findViewById(R.id.SPAmount);
        gpAmount = findViewById(R.id.GPAmount);
        abilities = new EditText[]{STR, DEX, CON, INT, WIS, CHA, STRT, DEXT, CONT, INTT, WIST, CHAT};
        SkillTotals[0] = findViewById(R.id.AcrobaticsTotal);
        SkillTotals[1] = findViewById(R.id.ArcanaTotal);
        SkillTotals[2] = findViewById(R.id.ArcanaTotal);
        SkillTotals[3] = findViewById(R.id.AthleticsTotal);
        SkillTotals[4] = findViewById(R.id.DeceptionTotal);
        SkillTotals[5] = findViewById(R.id.HistoryTotal);
        SkillTotals[6] = findViewById(R.id.InsightTotal);
        SkillTotals[7] = findViewById(R.id.IntimidationTotal);
        SkillTotals[8] = findViewById(R.id.InvestigationTotal);
        SkillTotals[9] = findViewById(R.id.MedicineTotal);
        SkillTotals[10] = findViewById(R.id.NatureTotal);
        SkillTotals[11] = findViewById(R.id.PerceptionTotal);
        SkillTotals[12] = findViewById(R.id.PerformanceTotal);
        SkillTotals[13] = findViewById(R.id.PersuasionTotal);
        SkillTotals[14] = findViewById(R.id.ReligionTotal);
        SkillTotals[15] = findViewById(R.id.SleightHandTotal);
        SkillTotals[16] = findViewById(R.id.StealthTotal);
        SkillTotals[17] = findViewById(R.id.SurvivalTotal);
        SkillAbilities[0] = findViewById(R.id.AcrobaticsAbility);
        SkillAbilities[1] = findViewById(R.id.AnimalHandAbility);
        SkillAbilities[2] = findViewById(R.id.ArcanaAbility);
        SkillAbilities[3] = findViewById(R.id.AthleticsAbility);
        SkillAbilities[4] = findViewById(R.id.DeceptionAbility);
        SkillAbilities[5] = findViewById(R.id.HistoryAbility);
        SkillAbilities[6] = findViewById(R.id.InsightAbility);
        SkillAbilities[7] = findViewById(R.id.IntimidationAbility);
        SkillAbilities[8] = findViewById(R.id.InvestigationAbility);
        SkillAbilities[9] = findViewById(R.id.MedicineAbility);
        SkillAbilities[10] = findViewById(R.id.NatureAbility);
        SkillAbilities[11] = findViewById(R.id.PerceptionAbility);
        SkillAbilities[12] = findViewById(R.id.PerformanceAbility);
        SkillAbilities[13] = findViewById(R.id.PersuasionAbility);
        SkillAbilities[14] = findViewById(R.id.ReligionAbiltiy);
        SkillAbilities[15] = findViewById(R.id.SleightHandAbility);
        SkillAbilities[16] = findViewById(R.id.StealthAbility);
        SkillAbilities[17] = findViewById(R.id.SurvivalAbility);
        SkillRanks[0] = findViewById(R.id.AcrobaticsRank);
        SkillRanks[1] = findViewById(R.id.AnimalHandRank);
        SkillRanks[2] = findViewById(R.id.ArcanaRank);
        SkillRanks[3] = findViewById(R.id.AthleticsRank);
        SkillRanks[4] = findViewById(R.id.DeceptionRank);
        SkillRanks[5] = findViewById(R.id.HistoryRank);
        SkillRanks[6] = findViewById(R.id.InsightRank);
        SkillRanks[7] = findViewById(R.id.IntimidationRank);
        SkillRanks[8] = findViewById(R.id.InvestigationRank);
        SkillRanks[9] = findViewById(R.id.MedicineRank);
        SkillRanks[10] = findViewById(R.id.NatureRank);
        SkillRanks[11] = findViewById(R.id.PerceptionRank);
        SkillRanks[12] = findViewById(R.id.PerformanceRank);
        SkillRanks[13] = findViewById(R.id.PersuasionRank);
        SkillRanks[14] = findViewById(R.id.ReligionRank);
        SkillRanks[15] = findViewById(R.id.SleightHandRank);
        SkillRanks[16] = findViewById(R.id.StealthRank);
        SkillRanks[17] = findViewById(R.id.SurvivalRank);
        SkillTitles[0] = findViewById(R.id.AcrobaticsTitle);
        SkillTitles[1] = findViewById(R.id.AnimalHandTitle);
        SkillTitles[2] = findViewById(R.id.ArcanaTitle);
        SkillTitles[3] = findViewById(R.id.AthleticsTitle);
        SkillTitles[4] = findViewById(R.id.DeceptionTitle);
        SkillTitles[5] = findViewById(R.id.HistoryTitle);
        SkillTitles[6] = findViewById(R.id.InsightTitle);
        SkillTitles[7] = findViewById(R.id.IntimidationTitle);
        SkillTitles[8] = findViewById(R.id.InvestigationTitle);
        SkillTitles[9] = findViewById(R.id.MedicineTitle);
        SkillTitles[10] = findViewById(R.id.NatureTitle);
        SkillTitles[11] = findViewById(R.id.PerceptionTitle);
        SkillTitles[12] = findViewById(R.id.PerformanceTitle);
        SkillTitles[13] = findViewById(R.id.PersuasionTitle);
        SkillTitles[14] = findViewById(R.id.ReligionTitle);
        SkillTitles[15] = findViewById(R.id.SleightHandTitle);
        SkillTitles[16] = findViewById(R.id.StealthTitle);
        SkillTitles[17] = findViewById(R.id.SurvivalTitle);
        Class = findViewById(R.id.ClassSpin);
        Level = findViewById(R.id.LevelEditbox);
        Race = findViewById(R.id.RaceSpin);
        Size = findViewById(R.id.SizeSpin);
        WType[0] = findViewById(R.id.WeaponsAttackType);
        WType[1] = findViewById(R.id.WeaponsAttackType2);
        WType[2] = findViewById(R.id.WeaponsAttackType3);
        HP = findViewById(R.id.HPOutput);
        AC = findViewById(R.id.ACTotalOutput);
        gsizeMod = findViewById(R.id.GrappleSize);
        gattackMod = findViewById(R.id.GrappleBaseAttackBonus);
        dmg[0] = findViewById(R.id.DMGOutput);
        dmg[1] = findViewById(R.id.DMGOutput2);
        dmg[2] = findViewById(R.id.DMGOutput3);
        strDerived[0] = findViewById(R.id.AthleticsAbility);
        strDerived[1] = findViewById(R.id.GrappleStrength);
        dexDerived[0] = findViewById(R.id.ReflexAbility);
        dexDerived[1] = findViewById(R.id.AcrobaticsAbility);
        dexDerived[2] = findViewById(R.id.SleightHandAbility);
        dexDerived[3] = findViewById(R.id.StealthAbility);
        conDerived[0] = findViewById(R.id.FortAbility);
        intDerived[0] = findViewById(R.id.ArcanaAbility);
        intDerived[1] = findViewById(R.id.HistoryAbility);
        intDerived[2] = findViewById(R.id.InvestigationAbility);
        intDerived[3] = findViewById(R.id.NatureAbility);
        intDerived[4] = findViewById(R.id.ReligionAbiltiy);
        wisDerived[0] = findViewById(R.id.WillAbility);
        wisDerived[1] = findViewById(R.id.AnimalHandAbility);
        wisDerived[2] = findViewById(R.id.InsightAbility);
        wisDerived[3] = findViewById(R.id.MedicineAbility);
        wisDerived[4] = findViewById(R.id.PerceptionAbility);
        wisDerived[5] = findViewById(R.id.SurvivalAbility);
        chaDerived[0] = findViewById(R.id.DeceptionAbility);
        chaDerived[1] = findViewById(R.id.IntimidationAbility);
        chaDerived[2] = findViewById(R.id.PerformanceAbility);
        chaDerived[3] = findViewById(R.id.PersuasionAbility);
        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this, R.array.Class_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter.createFromResource(this, R.array.Race_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> sizeAdapter = ArrayAdapter.createFromResource(this, R.array.Size_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> typeAdapter = ArrayAdapter.createFromResource(this, R.array.Type_array, android.R.layout.simple_spinner_item);

        //Resize code
        DisplayMetrics display = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(display);
        int width = display.widthPixels;
        double widthInch = Math.pow(display.widthPixels / display.xdpi, 2);
        double heightInch = Math.pow(display.heightPixels / display.ydpi, 2);
        double screenInch = Math.sqrt(widthInch + heightInch);
        screenInch = (double) Math.round(screenInch * 10) / 10;

        int text35;
        int text30;
        int text25;
        int text20;
        int nameBox = (width / 2) - 50;
        if (screenInch >= 6.8)
        {
            text35 = width / 35;
            text30 = width / 40;
            text25 = width / 50;
            text20 = width / 60;
        }
        else if (screenInch < 6.8 && screenInch >= 5)
        {
            text35 = width / 60;
            text30 = width / 65;
            text25 = width / 80;
            text20 = width / 85;
        }
        else
        {
            text35 = width / 55;
            text30 = width / 60;
            text25 = width / 70;
            text20 = width / 80;
        }
        CharName.setTextSize(text30);
        CharName.getLayoutParams().width = nameBox;
        PlayName.getLayoutParams().width = nameBox;
        PlayName.setTextSize(text30);
        Level.setTextSize(text30);
        Age.setTextSize(text30);
        Sex.setTextSize(text30);
        abilityModTitle.setTextSize(text30);
        tempModTitle.setTextSize(text30);
        strTitle.setTextSize(text35);
        dexTitle.setTextSize(text35);
        conTitle.setTextSize(text35);
        intTitle.setTextSize(text35);
        wisTitle.setTextSize(text35);
        chaTitle.setTextSize(text35);
        strSub.setTextSize(text20);
        dexSub.setTextSize(text20);
        conSub.setTextSize(text20);
        intSub.setTextSize(text20);
        wisSub.setTextSize(text20);
        chaSub.setTextSize(text20);
        hpTitle.setTextSize(text30);
        currHPTitle.setTextSize(text30);
        HP.setTextSize(text30);
        currHPBox.setTextSize(text30);
        acTitle.setTextSize(text35);
        acTotalTitle.setTextSize(text30);
        acTempTitle.setTextSize(text30);
        AC.setTextSize(text30);
        acTempBox.setTextSize(text30);
        savingThrowsTitle.setTextSize(text35);
        fortTitle.setTextSize(text35);
        reflexTitle.setTextSize(text35);
        willTitle.setTextSize(text35);
        FortBase.setTextSize(text30);
        RefBase.setTextSize(text30);
        WillBase.setTextSize(text30);
        fortTotal.setTextSize(text30);
        reflexTotal.setTextSize(text30);
        willTotal.setTextSize(text30);
        totalSaveTitle.setTextSize(text30);
        baseSaveTitle.setTextSize(text30);
        abilitySaveTitle.setTextSize(text30);
        skillsTitle.setTextSize(text35);
        skillsTotalTitle.setTextSize(text30);
        skillsAbilityTitle.setTextSize(text30);
        skillsRankTitle.setTextSize(text30);
        attacksTitle.setTextSize(text35);
        baseAttackTitle.setTextSize(text30);
        AttackBase.setTextSize(text30);
        grappleTitle.setTextSize(text30);
        grappleModifierTitle.setTextSize(text20);
        grappleTotalTitle.setTextSize(text20);
        grappleBaseAttackBonusTitle.setTextSize(text20);
        grappleStrengthTitle.setTextSize(text20);
        grappleSizeTitle.setTextSize(text20);
        grappleTotal.setTextSize(text30);
        gattackMod.setTextSize(text30);
        grappleStrength.setTextSize(text30);
        gsizeMod.setTextSize(text30);
        weaponsAttacksTitle.setTextSize(text35);
        dmgTitle.setTextSize(text35);
        typeTitle.setTextSize(text35);
        currencyTitle.setTextSize(text35);
        spTitle.setTextSize(text30);
        gpTitle.setTextSize(text30);
        spAmount.setTextSize(text30);
        gpAmount.setTextSize(text30);
        characterInventoryTitle.setTextSize(text30);
        characterBioTitle.setTextSize(text30);
        characterInventoryInput.setTextSize(text20);
        characterBioInput.setTextSize(text20);
        dmg[0].setTextSize(text30);
        dmg[1].setTextSize(text30);
        dmg[2].setTextSize(text30);
        for (TextView textView : strDerived)
        {
            textView.setTextSize(text30);
        }
        for (TextView textView : dexDerived)
        {
            textView.setTextSize(text30);
        }
        for (TextView textView : conDerived)
        {
            textView.setTextSize(text30);
        }
        for (TextView textView : intDerived)
        {
            textView.setTextSize(text30);
        }
        for (TextView textView : wisDerived)
        {
            textView.setTextSize(text30);
        }
        for (TextView textView : chaDerived)
        {
            textView.setTextSize(text30);
        }
        for (EditText skillRank : SkillRanks)
        {
            skillRank.setTextSize(text30);
            skillRank.setText("0");
        }
        for (TextView skillAbility : SkillAbilities)
        {
            skillAbility.setTextSize(text30);
        }
        for (TextView skillTotal : SkillTotals)
        {
            skillTotal.setTextSize(text30);
        }
        for (TextView skillTitle : SkillTitles)
        {
            skillTitle.setTextSize(text30);
        }
        for (EditText editText : weaponAttackInput)
        {
            editText.setTextSize(text25);
        }
        acTempBox.setText("0");
        AttackBase.setText("0");


        //Adapted from: https://stackoverflow.com/questions/4743116/get-screen-width-and-height-in-android#:~:text=Display%20display%20%3D%20getWindowManager().,size)%3B%20int%20width%20%3D%20size.
        //Also adapted from: https://stackoverflow.com/questions/2193457/is-there-a-way-to-determine-android-physical-screen-height-in-cm-or-inches

        //Set Defaults
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Class.setAdapter(classAdapter);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Race.setAdapter(raceAdapter);
        sizeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Size.setAdapter(sizeAdapter);
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        WType[0].setAdapter(typeAdapter);
        WType[1].setAdapter(typeAdapter);
        WType[2].setAdapter(typeAdapter);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            StringBuilder loadName = new StringBuilder(extras.getString("LoadName") + ".txt");

            for (int i = 0; i < loadName.length(); i ++)
            {
                if (loadName.charAt(i) == ' ')
                {
                    loadName.setCharAt(i, '_');
                }
            }
            if (!Load(loadName.toString())) {
                Submenutitle.setText("Failed to Load");
            }
            else
            {
                CharName.setText(extras.getString("LoadName"));
                Submenutitle.setText(extras.getString("LoadName"));
            }
        }

        //Actions
        Class.setOnItemSelectedListener(this);
        Race.setOnItemSelectedListener(this);
        Size.setOnItemSelectedListener(this);
        WType[0].setOnItemSelectedListener(this);
        WType[1].setOnItemSelectedListener(this);
        WType[2].setOnItemSelectedListener(this);

        for (int i = 0; i < abilities.length; i++) {
            int finalI = i;
            abilities[i].setOnFocusChangeListener((v, hasFocus) -> {
                if (!hasFocus) {
                    try {
                        abilities[finalI].setText(String.valueOf(Integer.parseInt(abilities[finalI].getText().toString())));
                    } catch (Exception e) {
                        abilities[finalI].setText("0");
                    }
                    if (abilityCheck()) {
                        Derive();
                    }
                }
            });
        }
        for (int i = 0; i < SkillRanks.length; i++) {
            int finalI = i;
            SkillRanks[i].setOnFocusChangeListener((v, hasFocus) -> {
                if (!hasFocus) {
                    try {
                        SkillRanks[finalI].setText(String.valueOf(Integer.parseInt(SkillRanks[finalI].getText().toString())));
                    } catch (Exception e) {
                        SkillRanks[finalI].setText("0");
                    }
                    Totals();
                }
            });
        }
        Level.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus) {
                try {
                    Integer.parseInt(Level.getText().toString());
                } catch (Exception e) {
                    Level.setText("1");
                }

                if (Class.getSelectedItemPosition() != 0)
                    SetSaves();
            }
        });
        CharName.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus) {
                Submenutitle.setText(CharName.getText().toString());
            }
        });
        Back.setOnClickListener(v -> SaveAlert(new Intent(ExpertCreateChar.this, MainActivity.class)));
        pmenu.setOnClickListener(this::showPopMenu);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.ClassSpin:
                switch (position) {
                    case 1:
                        //placeholder
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Cleric", Toast.LENGTH_LONG);
                        if (Level.getText().length() > 0)
                            SetSaves();
                        toast1.show();
                        break;
                    case 2:
                        //placeholder
                        Toast toast2 = Toast.makeText(getApplicationContext(), "Fighter", Toast.LENGTH_LONG);
                        if (Level.getText().length() > 0)
                            SetSaves();
                        toast2.show();
                        break;
                    case 3:
                        //placeholder
                        Toast toast3 = Toast.makeText(getApplicationContext(), "Wizard", Toast.LENGTH_LONG);
                        if (Level.getText().length() > 0)
                            SetSaves();
                        toast3.show();
                        break;
                    case 4:
                        //placeholder
                        Toast toast4 = Toast.makeText(getApplicationContext(), "Rogue", Toast.LENGTH_LONG);
                        if (Level.getText().length() > 0)
                            SetSaves();
                        toast4.show();
                        break;
                }
                break;
            case R.id.RaceSpin:
                switch (position) {
                    case 1:
                        //placeholder
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Human; Cha+, Dex+, Con-", Toast.LENGTH_LONG);
                        toast1.show();
                        abilityCheck();
                        break;
                    case 2:
                        //placeholder
                        Toast toast2 = Toast.makeText(getApplicationContext(), "Elf; Int+, Dex+, Str-", Toast.LENGTH_LONG);
                        toast2.show();
                        abilityCheck();
                        break;
                    case 3:
                        //placeholder
                        Toast toast3 = Toast.makeText(getApplicationContext(), "Dwarf; Wis+, Con+, Cha-", Toast.LENGTH_LONG);
                        toast3.show();
                        abilityCheck();
                        break;
                    case 4:
                        //placeholder
                        Toast toast4 = Toast.makeText(getApplicationContext(), "Orc; Str+, Con+, Int-", Toast.LENGTH_LONG);
                        toast4.show();
                        abilityCheck();
                        break;
                }
                break;
            case R.id.SizeSpin:
                switch (position) {
                    case 1:
                        //placeholder
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Large", Toast.LENGTH_LONG);
                        gsizeMod.setText("1");
                        toast1.show();
                        break;
                    case 2:
                        //placeholder
                        Toast toast2 = Toast.makeText(getApplicationContext(), "Medium", Toast.LENGTH_LONG);
                        gsizeMod.setText("0");
                        toast2.show();
                        break;
                    case 3:
                        //placeholder
                        Toast toast3 = Toast.makeText(getApplicationContext(), "Small", Toast.LENGTH_LONG);
                        gsizeMod.setText("-1");
                        toast3.show();
                        break;
                }
                break;
            case R.id.WeaponsAttackType:
                switch (position) {
                    case 1:
                        dmg[0].setText(SetDmg(1));
                        break;
                    case 2:
                        dmg[0].setText(SetDmg(2));
                        break;
                    case 3:
                        dmg[0].setText(SetDmg(3));
                        break;
                }
                break;
            case R.id.WeaponsAttackType2:
                switch (position) {
                    case 1:
                        dmg[1].setText(SetDmg(1));
                        break;
                    case 2:
                        dmg[1].setText(SetDmg(2));
                        break;
                    case 3:
                        dmg[1].setText(SetDmg(3));
                        break;
                }
                break;
            case R.id.WeaponsAttackType3:
                switch (position) {
                    case 1:
                        dmg[2].setText(SetDmg(1));
                        break;
                    case 2:
                        dmg[2].setText(SetDmg(2));
                        break;
                    case 3:
                        dmg[2].setText(SetDmg(3));
                        break;
                }
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private boolean abilityCheck() {
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
        switch (Race.getSelectedItemPosition()) {
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

        if (sumPoints > pointMax) {
            Toast toast = Toast.makeText(getApplicationContext(), "Over Spent", Toast.LENGTH_LONG);
            toast.show();
            abilityModTitle.setTextColor(Color.parseColor("#FF0000"));
        } else if (sumPoints == pointMax) {
            abilityModTitle.setTextColor(Color.parseColor("#FFFFFF"));
            return true;
        } else {
            abilityModTitle.setTextColor(Color.parseColor("#FFFFFF"));
        }

        return false;
    }

    private void Derive() {
        for (int i = 0; i < abilitiesDerived.length; i++) {
            for (int j = 0; j < abilitiesDerived[i].length; j++) {
                abilitiesDerived[i][j].setText(String.valueOf(Integer.parseInt(abilities[i].getText().toString()) + Integer.parseInt(abilities[i + 6].getText().toString())));
            }
        }
    }

    private String SetDmg(int position) {
        String dmg = "";

        switch (Size.getSelectedItemPosition()) {
            case 1:
                dmg = "3";
                break;
            case 2:
                dmg = "2";
                break;
            case 3:
                dmg = "1";
                break;
        }

        switch (position) {
            case 1:
                dmg += "d4";
                if (Integer.parseInt(STR.getText().toString()) >= 0)
                    dmg += "+";
                dmg += STR.getText().toString();
                break;
            case 2:
                dmg += "d6";
                if (Integer.parseInt(STR.getText().toString()) >= 0)
                    dmg += "+";
                dmg += STR.getText().toString();
                break;
            case 3:
                dmg += "d8";
                if (Integer.parseInt(STR.getText().toString()) >= 0)
                    dmg += "+";
                dmg += String.valueOf((int) (Integer.parseInt(STR.getText().toString()) * 1.5));
                break;
        }

        return dmg;
    }

    private void SetSaves() {
        int lvl = Integer.parseInt(Level.getText().toString());

        switch (Class.getSelectedItemPosition()) {
            //Cleric
            case 1:
                FortBase.setText(String.valueOf((int) lvl / 2));
                RefBase.setText(String.valueOf((int) lvl / 3));
                WillBase.setText(String.valueOf((int) lvl));
                AttackBase.setText(String.valueOf((int) lvl / 3));
                break;
            //Fighter
            case 2:
                FortBase.setText(String.valueOf((int) lvl));
                RefBase.setText(String.valueOf((int) lvl / 2));
                WillBase.setText(String.valueOf((int) lvl / 3));
                AttackBase.setText(String.valueOf((int) lvl));
                break;
            //Wizard
            case 3:
                FortBase.setText(String.valueOf((int) lvl / 3));
                RefBase.setText(String.valueOf((int) lvl / 2));
                WillBase.setText(String.valueOf((int) lvl));
                AttackBase.setText(String.valueOf((int) lvl / 4));
                break;
            //Rogue
            case 4:
                FortBase.setText(String.valueOf((int) lvl / 2));
                RefBase.setText(String.valueOf((int) lvl));
                WillBase.setText(String.valueOf((int) lvl / 3));
                AttackBase.setText(String.valueOf((int) lvl / 2));
                break;
        }

        gattackMod.setText(AttackBase.getText().toString());
    }

    private void Totals() {
        for (int i = 0; i < SkillTotals.length; i++) {
            int sability;
            try {
                sability = Integer.parseInt(SkillAbilities[i].getText().toString());
            } catch (Exception e) {
                sability = 0;
            }
            int srank;
            try {
                srank = Integer.parseInt(SkillRanks[i].getText().toString());
            } catch (Exception e) {
                SkillRanks[i].setText("0");
                srank = 0;
            }
            int total = sability + srank;
            SkillTotals[i].setText(String.valueOf(total));
        }

        Roller roll;
        try {
            Integer.parseInt(Level.getText().toString());
        } catch (Exception e) {
            Level.setText("1");
        }
        switch (Class.getSelectedItemPosition()) {
            case 1:
                roll = new Roller(Integer.parseInt(Level.getText().toString()), 8);
                roll.Rolling();
                break;
            case 2:
                roll = new Roller(Integer.parseInt(Level.getText().toString()), 10);
                roll.Rolling();
                break;
            case 3:
                roll = new Roller(Integer.parseInt(Level.getText().toString()), 4);
                roll.Rolling();
                break;
            default:
                roll = new Roller(Integer.parseInt(Level.getText().toString()), 6);
                roll.Rolling();
        }
        int RollTot = 0;
        for (int i = 0; i < Integer.parseInt(Level.getText().toString()); i++) {
            RollTot += roll.GetRolls(i);
        }
        try {
            HP.setText(String.valueOf(Integer.parseInt(CON.getText().toString()) + RollTot));
        } catch (Exception e) {
            HP.setText("0");
        }
        EditText ACTemp = findViewById(R.id.ACTempBox);
        try {
            Integer.parseInt(ACTemp.getText().toString());
            AC.setText(String.valueOf(Integer.parseInt(DEX.getText().toString()) + 10 + Integer.parseInt(ACTemp.getText().toString())));
        } catch (Exception e) {
            AC.setText("0");
        }

        //Saves
        try {
            fortTotal = findViewById(R.id.FortTotal);
            reflexTotal = findViewById(R.id.ReflexTotal);
            willTotal = findViewById(R.id.WillTotal);
            fortTotal.setText(String.valueOf(Integer.parseInt(FortBase.getText().toString()) + Integer.parseInt(conDerived[0].getText().toString())));
            reflexTotal.setText(String.valueOf(Integer.parseInt(RefBase.getText().toString()) + Integer.parseInt(dexDerived[0].getText().toString())));
            willTotal.setText(String.valueOf(Integer.parseInt(WillBase.getText().toString()) + Integer.parseInt(wisDerived[0].getText().toString())));
        } catch (Exception e) {
            e.getStackTrace();
        }

        for (int i = 0; i < SkillRanks.length; i++)
        {
            if (SkillRanks[i].getText().length() < 1)
            {
                SkillRanks[i].setText("0");
            }
        }
    }

    private void showPopMenu(View v) {
        PopupMenu popMenu = new PopupMenu(ExpertCreateChar.this, v);
        popMenu.getMenuInflater().inflate(R.menu.popup_menu, popMenu.getMenu());
        popMenu.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.popup_profile) {
                SaveAlert(new Intent(ExpertCreateChar.this, ProfileActivity.class));
            }
            if (item.getItemId() == R.id.popup_help) {
                SaveAlert(new Intent(ExpertCreateChar.this, HelpActivity.class));
            }
            if (item.getItemId() == R.id.popup_settings) {
                //Placeholder code
                Toast.makeText(ExpertCreateChar.this, "You clicked Settings", Toast.LENGTH_SHORT).show();
            }
            return true;
        });

        popMenu.show();
    }

    private void SaveAlert(Intent exitDirection) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(ExpertCreateChar.this, R.style.CharacterSheetTheme);
        builder.setTitle("Save Character?");
        builder.setMessage("The page is exiting would you like to save before exiting?");
        builder.setBackground(getResources().getDrawable(R.drawable.save_dialog_bg));
        builder.setPositiveButton("YES", (dialog, which) -> {
            Save();
            startActivity(exitDirection);
        });
        builder.setNegativeButton("NO", (dialog, which) -> startActivity(exitDirection));
        builder.setNeutralButton("CANCEL", (dialog, which) -> {
        });
        builder.show();
    }

    private void Save() {
        FileOutputStream fos;
        try {
            StringBuilder saveName = new StringBuilder(CharName.getText().toString() + ".txt");

            for (int i = 0; i < saveName.length(); i ++)
            {
                if (saveName.charAt(i) == ' ')
                {
                    saveName.setCharAt(i, '_');
                }
            }
            File charFile = new File(getApplicationContext().getFilesDir(), saveName.toString());

            if (!charFile.exists()) {
                try {
                    charFile.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            fos = openFileOutput(saveName.toString(), MODE_PRIVATE);

            StringBuilder data = new StringBuilder(Level.getText().toString());
            data.append("\0");
            data.append(Class.getSelectedItemPosition());
            data.append("\0");
            data.append(Race.getSelectedItemPosition());
            data.append("\0");
            data.append(Size.getSelectedItemPosition());
            data.append("\0");
            for (EditText ability : abilities) {
                data.append(ability.getText().toString());
                data.append("\0");
            }
            for (EditText skillRank : SkillRanks) {
                data.append(skillRank.getText().toString());
                data.append("\0");
            }

            if (weaponAttackInput[0].getText().toString().length() > 0) {
                data.append("\1");
                data.append("\0");
                data.append(weaponAttackInput[0].getText().toString());
                data.append("\0");
                data.append(dmg[0].getText().toString());
                data.append("\0");
                data.append(WType[0].getSelectedItemPosition());
                data.append("\0");
            }
            if (weaponAttackInput[1].getText().toString().length() > 0) {
                data.append("\1");
                data.append("\0");
                data.append(weaponAttackInput[1].getText().toString());
                data.append("\0");
                data.append(dmg[1].getText().toString());
                data.append("\0");
                data.append(WType[1].getSelectedItemPosition());
                data.append("\0");
            }
            if (weaponAttackInput[2].getText().toString().length() > 0) {
                data.append("\1");
                data.append("\0");
                data.append(weaponAttackInput[2].getText().toString());
                data.append("\0");
                data.append(dmg[2].getText().toString());
                data.append("\0");
                data.append(WType[2].getSelectedItemPosition());
                data.append("\0");
            }
            data.append(spAmount.getText().toString());
            data.append("\0");
            data.append(gpAmount.getText().toString());
            data.append("\0");
            data.append(characterInventoryInput.getText().toString());
            data.append("\0");
            data.append(characterBioInput.getText().toString());
            data.append("\0");
            data.append(Age.getText());
            data.append("\0");
            data.append(Sex.getText());
            data.append("\0");

            fos.write(data.toString().getBytes());
            Log.d(saveName.toString(), "Saved");
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //update settings to remember saved name
        try {
            File settings = new File(getApplicationContext().getFilesDir(), "settings.txt");

            if (!settings.exists()) {
                try {
                    settings.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            fos = openFileOutput("settings.txt", Context.MODE_APPEND);
            String saveName = CharName.getText().toString() + "\0";
            fos.write(saveName.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean Load(String loadName) {
        boolean returnType = false;
        Log.d(loadName, "Attempting Load");
        try
        {
            FileInputStream input = openFileInput(loadName);

            int i = input.read();
            int total = 0;
            int current = 0;
            int iter = 0;

            //Debugging
            System.out.println(current);
            System.out.println(i);
            System.out.println(iter);


            while (i != -1)
            {
                //ToDo: add Load Logic
                if (i != 0)
                {
                    total = (char)i;
                    i = input.read();
                } else {
                    switch (current) {
                        case 0:
                            returnType = true;
                            Level.setText(String.valueOf((char) total));
                            current++;
                            break;
                        case 1:
                            Class.setSelection(Character.getNumericValue(total));
                            current++;
                            break;
                        case 2:
                            Race.setSelection(Character.getNumericValue(total));
                            current++;
                            break;
                        case 3:
                            Size.setSelection(Character.getNumericValue(total));
                            current++;
                            break;
                        case 4:
                            abilities[iter].setText(String.valueOf(Character.getNumericValue((char) total)));
                            iter++;
                            if (iter > 5) {
                                current++;
                                iter = 0;
                            }
                            break;
                        case 5:
                            SkillRanks[iter].setText(String.valueOf(Character.getNumericValue((char) total)));
                            iter++;
                            if (iter > 17) {
                                current++;
                                iter = 0;
                                returnType = true;
                            }
                            break;
                        case 6:
                            if (total != 1)
                            {
                                current++;
                                iter = 0;
                                break;
                            }
                            i = input.read();
                            StringBuilder temp = new StringBuilder();
                            while(i != 0)
                            {
                                temp.append((char)i);
                                i = input.read();
                            }
                            weaponAttackInput[iter].setText(temp.toString());
                            i = input.read();
                            temp = new StringBuilder();
                            while(i != 0)
                            {
                                temp.append((char)i);
                                i = input.read();
                            }
                            dmg[iter].setText(temp.toString());
                            i = input.read();
                            int type = 0;
                            while(i != 0)
                            {
                                total = (char)i;
                                i = input.read();
                            }
                            WType[iter].setSelection(Character.getNumericValue(total));
                            iter++;
                            break;
                        case 7:
                            iter = 0;
                            spAmount.setText(Character.getNumericValue(total));
                            current++;
                            break;
                        case 8:
                            gpAmount.setText(Character.getNumericValue(total));
                            current++;
                            break;
                        case 9:
                            characterInventoryInput.setText(Character.getNumericValue(total));
                            current++;
                            break;
                        case 10:
                            characterBioInput.setText(Character.getNumericValue(total));
                            current++;
                            break;
                        case 11:
                            Age.setText(Character.getNumericValue(total));
                            current++;
                            break;
                        case 12:
                            Sex.setText(Character.getNumericValue(total));
                            current++;
                            break;
                        default:
                            CharName.setText("WTF");
                            break;
                    }


                    total = 0;
                    i = input.read();
                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        return returnType;
    }
}


