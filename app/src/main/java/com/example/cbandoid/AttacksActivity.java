package com.example.cbandoid;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
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
    TextView grappleTotalTitle;
    TextView grappleTotal;
    TextView grappleStrength;
    TextView weaponsAttacksTitle;
    TextView dmgTitle;
    TextView typeTitle;
    TextView gsizeMod;
    TextView gattackMod;
    Spinner WType0;
    Spinner WType1;
    Spinner WType2;
    TextView dmg0;
    TextView dmg1;
    TextView dmg2;
    EditText[] weaponAttackInput = new EditText[3];
    TextView[] attacksHints = new TextView[5];

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
        grappleTotal = (TextView)view.findViewById(R.id.GrappleTotal);
        grappleStrength = (TextView)view.findViewById(R.id.GrappleStrength);
        gsizeMod = (TextView)view.findViewById(R.id.GrappleSize);
        gattackMod = (TextView)view.findViewById(R.id.GrappleBaseAttackBonus);
        weaponsAttacksTitle = (TextView)view.findViewById(R.id.WeaponsAttacksTitle);
        dmgTitle = (TextView)view.findViewById(R.id.DMGTitle);
        typeTitle = (TextView)view.findViewById(R.id.TypeTitle);
        WType0 = (Spinner)view.findViewById(R.id.WeaponsAttackType);
        WType1 = (Spinner)view.findViewById(R.id.WeaponsAttackType2);
        WType2 = (Spinner)view.findViewById(R.id.WeaponsAttackType3);
        dmg0 = (TextView)view.findViewById(R.id.DMGOutput);
        dmg1 = (TextView)view.findViewById(R.id.DMGOutput2);
        dmg2 = (TextView)view.findViewById(R.id.DMGOutput3);
        weaponAttackInput[0] = (EditText) view.findViewById(R.id.WeaponAttackInput);
        weaponAttackInput[1] = (EditText) view.findViewById(R.id.WeaponAttackInput2);
        weaponAttackInput[2] = (EditText) view.findViewById(R.id.WeaponAttackInput3);
        attacksHints[0] = (TextView) view.findViewById(R.id.AttacksHint);
        attacksHints[1] = (TextView) view.findViewById(R.id.BaseAttackHint);
        attacksHints[2] = (TextView) view.findViewById(R.id.ExtraAttackBonusHint);
        attacksHints[3] = (TextView) view.findViewById(R.id.GrappleHint);
        attacksHints[4] = (TextView) view.findViewById(R.id.WeaponsDMGTypeHint);

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

        attacksTitle.setTextSize(text35);
        baseAttackTitle.setTextSize(text30);
        AttackBase.setTextSize(text30);
        extraAttacksTitle.setTextSize(text30);
        extraAttackBox.setTextSize(text30);
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
        dmg0.setTextSize(text30);
        dmg1.setTextSize(text30);
        dmg2.setTextSize(text30);
        for (EditText editText : weaponAttackInput)
        {
            editText.setTextSize(text25);
        }
        for (TextView AttackHints : attacksHints)
        {
            AttackHints.setTextSize(text25);
        }

        return view;
    }
}
