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

public class AttacksActivity extends Fragment
{

    TextView attacksTitle;
    TextView baseAttackTitle;
    TextView extraAttacksTitle;
    EditText extraAttackBox;
    TextView AttackBase;
    TextView grappleTitle;
    TextView grappleBaseAttackBonusTitle;
    TextView grappleModifierTitle;
    TextView grappleStrengthTitle;
    TextView grappleSizeTitle;
    TextView grappleMiscTitle;
    TextView grappleTotalTitle;
    TextView grappleTotal;
    TextView grappleStrength;
    TextView grappleMisc;
    TextView weaponsAttacksTitle;
    TextView dmgTitle;
    TextView typeTitle;
    TextView gsizeMod;
    TextView gattackMod;
    TextView dmg0;
    TextView dmg1;
    TextView dmg2;
    EditText[] weaponAttackInput = new EditText[3];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.charprompt_attacks, container, false);

        attacksTitle = (TextView)view.findViewById(R.id.AttacksTitle);
        baseAttackTitle = (TextView)view.findViewById(R.id.BaseAttackTitle);
        extraAttacksTitle = (TextView)view.findViewById(R.id.ExtraAttacksTitle);
        extraAttackBox = (EditText) view.findViewById(R.id.ExtraAttackBox);
        AttackBase = (TextView)view.findViewById(R.id.BaseAttackBox);
        grappleTitle = (TextView)view.findViewById(R.id.GrappleTitle);
        grappleTotalTitle = (TextView)view.findViewById(R.id.GrappleTotalTitle);
        grappleModifierTitle = (TextView)view.findViewById(R.id.GrappleModifierTitle);
        grappleBaseAttackBonusTitle = (TextView)view.findViewById(R.id.GrappleAttackBonusTitle);
        grappleStrengthTitle = (TextView)view.findViewById(R.id.GrappleStrengthTitle);
        grappleSizeTitle = (TextView)view.findViewById(R.id.GrappleSizeTitle);
        grappleMiscTitle = (TextView)view.findViewById(R.id.GrappleMiscTitle);
        grappleTotal = (TextView)view.findViewById(R.id.GrappleTotal);
        grappleStrength = (TextView)view.findViewById(R.id.GrappleStrength);
        grappleMisc = (TextView)view.findViewById(R.id.GrappleMisc);
        weaponsAttacksTitle = (TextView)view.findViewById(R.id.WeaponsAttacksTitle);
        dmgTitle = (TextView)view.findViewById(R.id.DMGTitle);
        typeTitle = (TextView)view.findViewById(R.id.TypeTitle);

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
            text35 = width / 60;
            text30 = width / 65;
            text25 = width / 80;
            text20 = width / 85;
        }
        else
        {
            text35 = width / 50;
            text30 = width / 60;
            text25 = width / 70;
            text20 = width / 80;
        }



        return view;
    }
}
