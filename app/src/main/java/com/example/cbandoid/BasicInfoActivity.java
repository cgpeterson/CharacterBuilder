package com.example.cbandoid;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.EditText;
import android.widget.TextView;


public class BasicInfoActivity extends Fragment
{

    EditText CharName;
    EditText PlayName;
    EditText Age;
    EditText Sex;
    EditText Level;
    TextView basicInfoTitle;
    TextView charNameQuest;
    TextView playerNameQuest;
    TextView charAgeQuest1;
    TextView charAgeQuest2;
    TextView charSexQuest;
    TextView charLevelQuest;
    TextView charClassQuest;
    TextView charRaceQuest;
    TextView charSizeQuest;
    TextView levelHint;
    TextView classHint;
    TextView raceHint;
    TextView sizeHint;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.charprompt_basic, container, false);

        CharName = (EditText) view.findViewById(R.id.CharNameEdit);
        PlayName = (EditText) view.findViewById(R.id.PlayerNameEdit);
        Age = (EditText) view.findViewById(R.id.AgeEditbox);
        Sex = (EditText) view.findViewById(R.id.SexEdit);
        Level = (EditText) view.findViewById(R.id.LevelEditbox);
        basicInfoTitle = (TextView) view.findViewById(R.id.BasicInfoTitle);
        charNameQuest = (TextView) view.findViewById(R.id.CharNameQuest);
        playerNameQuest = (TextView) view.findViewById(R.id.PlayerNameQuest);
        charAgeQuest1 = (TextView) view.findViewById(R.id.CharAgeQuest1);
        charAgeQuest2 = (TextView) view.findViewById(R.id.CharAgeQuest2);
        charSexQuest = (TextView) view.findViewById(R.id.CharSexQuest);
        charLevelQuest = (TextView) view.findViewById(R.id.CharLevelQuest);
        charClassQuest = (TextView) view.findViewById(R.id.CharClassQuest);
        charRaceQuest = (TextView) view.findViewById(R.id.CharRaceQuest);
        charSizeQuest = (TextView) view.findViewById(R.id.CharSizeQuest);
        levelHint = (TextView) view.findViewById(R.id.LevelHint);
        classHint = (TextView) view.findViewById(R.id.ClassHint);
        raceHint = (TextView) view.findViewById(R.id.RaceHint);
        sizeHint = (TextView) view.findViewById(R.id.SizeHint);

        DisplayMetrics display = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(display);
        int width = display.widthPixels;
        double widthInch = Math.pow(display.widthPixels / display.xdpi, 2);
        double heightInch = Math.pow(display.heightPixels / display.ydpi, 2);
        double screenInch = Math.sqrt(widthInch + heightInch);
        screenInch = (double) Math.round(screenInch * 10) / 10;

        int text35;
        int text30;
        int text25;
        int text20;
        if (screenInch >= 6.8) {
            text35 = width / 25;
            text30 = width / 30;
            text25 = width / 40;
            text20 = width / 60;

        } else if (screenInch < 6.8 && screenInch >= 5) {
            text35 = width / 50;
            text30 = width / 55;
            text25 = width / 70;
            text20 = width / 85;

        } else {
            text35 = width / 45;
            text30 = width / 50;
            text25 = width / 60;
            text20 = width / 80;

        }
        CharName.setTextSize(text30);
        PlayName.setTextSize(text30);
        Level.setTextSize(text30);
        Age.setTextSize(text30);
        Sex.setTextSize(text30);
        basicInfoTitle.setTextSize(text35);
        charNameQuest.setTextSize(text30);
        playerNameQuest.setTextSize(text30);
        charAgeQuest1.setTextSize(text30);
        charAgeQuest2.setTextSize(text30);
        charSexQuest.setTextSize(text30);
        charLevelQuest.setTextSize(text30);
        charClassQuest.setTextSize(text30);
        charRaceQuest.setTextSize(text30);
        charSizeQuest.setTextSize(text30);
        levelHint.setTextSize(text25);
        classHint.setTextSize(text25);
        raceHint.setTextSize(text25);
        sizeHint.setTextSize(text25);



        return view;
    }




}
