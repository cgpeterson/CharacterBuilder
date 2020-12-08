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

public class AbilityModActivity extends Fragment
{

    TextView abilitiesTitle;
    TextView abilityModTitle;
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
    TextView[] abilityHints = new TextView[7];


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.charprompt_abilitymod, container, false);

        abilitiesTitle = (TextView)view.findViewById(R.id.AbilitiesTitle);
        abilityModTitle = (TextView)view.findViewById(R.id.AbilityModTitle);
        tempModTitle = (TextView)view.findViewById(R.id.TempModTitle);
        strTitle = (TextView)view.findViewById(R.id.STRTitle);
        dexTitle = (TextView)view.findViewById(R.id.DEXTitle);
        conTitle = (TextView)view.findViewById(R.id.CONTitle);
        intTitle = (TextView)view.findViewById(R.id.INTTitle);
        wisTitle = (TextView)view.findViewById(R.id.WISTitle);
        chaTitle = (TextView)view.findViewById(R.id.CHATitle);
        strSub = (TextView)view.findViewById(R.id.STRSub);
        dexSub = (TextView)view.findViewById(R.id.DEXSub);
        conSub = (TextView)view.findViewById(R.id.CONSub);
        intSub = (TextView)view.findViewById(R.id.INTSub);
        wisSub = (TextView)view.findViewById(R.id.WISSub);
        chaSub = (TextView)view.findViewById(R.id.CHASub);
        STR = (EditText)view.findViewById(R.id.STRABox);
        DEX = (EditText)view.findViewById(R.id.DEXABox);
        CON = (EditText)view.findViewById(R.id.CONABox);
        INT = (EditText)view.findViewById(R.id.INTABox);
        WIS = (EditText)view.findViewById(R.id.WISABox);
        CHA = (EditText)view.findViewById(R.id.CHAABox);
        STRT = (EditText)view.findViewById(R.id.STRTBox);
        DEXT = (EditText)view.findViewById(R.id.DEXTBox);
        CONT = (EditText)view.findViewById(R.id.CONTBox);
        INTT = (EditText)view.findViewById(R.id.INTTBox);
        WIST = (EditText)view.findViewById(R.id.WISTBox);
        CHAT = (EditText)view.findViewById(R.id.CHATBox);
        abilityHints[0] = (TextView)view.findViewById(R.id.AbilitiesHint);
        abilityHints[1] = (TextView)view.findViewById(R.id.STRHint);
        abilityHints[2] = (TextView)view.findViewById(R.id.DEXHint);
        abilityHints[3] = (TextView)view.findViewById(R.id.CONHint);
        abilityHints[4] = (TextView)view.findViewById(R.id.INTHint);
        abilityHints[5] = (TextView)view.findViewById(R.id.WISHint);
        abilityHints[6] = (TextView)view.findViewById(R.id.CHAHint);

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

        abilitiesTitle.setTextSize(text35);
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
        STR.setTextSize(text30);
        DEX.setTextSize(text30);
        CON.setTextSize(text30);
        INT.setTextSize(text30);
        WIS.setTextSize(text30);
        CHA.setTextSize(text30);
        STRT.setTextSize(text30);
        DEXT.setTextSize(text30);
        CONT.setTextSize(text30);
        INTT.setTextSize(text30);
        WIST.setTextSize(text30);
        CHAT.setTextSize(text30);
        for (TextView textView : abilityHints)
        {
            textView.setTextSize(text25);
        }

        return view;
    }
}
