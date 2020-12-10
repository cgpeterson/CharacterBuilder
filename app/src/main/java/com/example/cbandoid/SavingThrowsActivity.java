package com.example.cbandoid;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SavingThrowsActivity extends Fragment
{
    TextView hpTitle;
    TextView currHPTitle;
    TextView HP;
    EditText currHPBox;
    TextView acTitle;
    TextView acTotalTitle;
    TextView acTempTitle;
    TextView AC;
    EditText acTempBox;
    TextView savingThrowsTitle;
    TextView totalSaveTitle;
    TextView baseSaveTitle;
    TextView abilitySaveTitle;
    TextView fortTitle;
    TextView reflexTitle;
    TextView willTitle;
    TextView fortTotal;
    TextView reflexTotal;
    TextView willTotal;
    TextView FortBase;
    TextView RefBase;
    TextView WillBase;
    TextView fortAbility;
    TextView reflexAbility;
    TextView willAbility;
    TextView[] savingHints = new TextView[4];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.charprompt_savingthrows, container, false);

        hpTitle = (TextView)view.findViewById(R.id.HPTitle);
        currHPTitle = (TextView)view.findViewById(R.id.CurrHPTitle);
        currHPBox = (EditText)view.findViewById(R.id.CurrHPBox);
        HP = (TextView)view.findViewById(R.id.HPOutput);
        AC = (TextView)view.findViewById(R.id.ACTotalOutput);
        acTitle = (TextView)view.findViewById(R.id.ACTitle);
        acTotalTitle = (TextView)view.findViewById(R.id.ACTotalTitle);
        acTempTitle = (TextView)view.findViewById(R.id.ACTempTitle);
        acTempBox = (EditText)view.findViewById(R.id.ACTempBox);
        savingThrowsTitle = (TextView)view.findViewById(R.id.SavingThrowsTitle);
        totalSaveTitle = (TextView)view.findViewById(R.id.TotalSaveTitle);
        baseSaveTitle = (TextView)view.findViewById(R.id.BaseSaveTitle);
        abilitySaveTitle = (TextView)view.findViewById(R.id.AbilitySaveTitle);
        fortTitle = (TextView)view.findViewById(R.id.FortTitle);
        reflexTitle = (TextView)view.findViewById(R.id.ReflexTitle);
        willTitle = (TextView)view.findViewById(R.id.WillTitle);
        savingHints[0] = (TextView)view.findViewById(R.id.HPHint);
        savingHints[1] = (TextView)view.findViewById(R.id.CurrHPHint);
        savingHints[2] = (TextView)view.findViewById(R.id.ACHint);
        savingHints[3] = (TextView)view.findViewById(R.id.SavingThrowsHint);
        fortTotal= (TextView)view.findViewById(R.id.FortTotal);
        reflexTotal= (TextView)view.findViewById(R.id.ReflexTotal);
        willTotal= (TextView)view.findViewById(R.id.WillTotal);
        FortBase = (TextView)view.findViewById(R.id.FortBase);
        RefBase = (TextView)view.findViewById(R.id.ReflexBase);
        WillBase = (TextView)view.findViewById(R.id.WillBase);
        fortAbility = (TextView)view.findViewById(R.id.FortAbility);
        reflexAbility = (TextView)view.findViewById(R.id.ReflexAbility);
        willAbility = (TextView)view.findViewById(R.id.WillAbility);

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
        if (screenInch >= 6.8)
        {
            text35 = width / 35;
            text30 = width / 40;
            text25 = width / 50;
            text20 = width / 60;

        }
        else if (screenInch < 6.8 && screenInch >= 5)
        {
            text35 = width / 50;
            text30 = width / 55;
            text25 = width / 70;
            text20 = width / 85;
        }
        else
        {
            text35 = width / 45;
            text30 = width / 50;
            text25 = width / 60;
            text20 = width / 80;
        }

        hpTitle.setTextSize(text35);
        currHPTitle.setTextSize(text35);
        HP.setTextSize(text30);
        currHPBox.setTextSize(text30);
        acTitle.setTextSize(text35);
        acTotalTitle.setTextSize(text30);
        acTempTitle.setTextSize(text30);
        AC.setTextSize(text30);
        acTempBox.setTextSize(text30);
        savingThrowsTitle.setTextSize(text35);
        totalSaveTitle.setTextSize(text30);
        baseSaveTitle.setTextSize(text30);
        abilitySaveTitle.setTextSize(text30);
        fortTitle.setTextSize(text35);
        reflexTitle.setTextSize(text35);
        willTitle.setTextSize(text35);
        FortBase.setTextSize(text30);
        RefBase.setTextSize(text30);
        WillBase.setTextSize(text30);
        fortTotal.setTextSize(text30);
        reflexTotal.setTextSize(text30);
        willTotal.setTextSize(text30);
        fortAbility.setTextSize(text30);
        reflexAbility.setTextSize(text30);
        willAbility.setTextSize(text30);
        for (TextView textView : savingHints)
        {
            textView.setTextSize(text25);
        }

        return view;
    }
}
