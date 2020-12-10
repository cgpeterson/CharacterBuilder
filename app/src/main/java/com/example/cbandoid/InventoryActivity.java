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

public class InventoryActivity extends Fragment
{

    TextView currencyTitle;
    TextView spTitle;
    TextView gpTitle;
    EditText spAmount;
    EditText gpAmount;
    TextView characterInventoryTitle;
    TextView characterBioTitle;
    EditText characterInventoryInput;
    EditText characterBioInput;
    TextView[] inventoryHints = new TextView[5];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.charprompt_inventory, container, false);

        currencyTitle = (TextView)view.findViewById(R.id.CurrencyTitle);
        spTitle = (TextView)view.findViewById(R.id.SPTitle);
        gpTitle = (TextView)view.findViewById(R.id.GPTitle);
        spAmount = (EditText) view.findViewById(R.id.SPAmount);
        gpAmount = (EditText) view.findViewById(R.id.GPAmount);
        characterInventoryTitle = (TextView)view.findViewById(R.id.CharacterInventoryTitle);
        characterBioTitle = (TextView)view.findViewById(R.id.CharacterBioTitle);
        characterInventoryInput = (EditText) view.findViewById(R.id.CharacterInventoryInput);
        characterBioInput = (EditText) view.findViewById(R.id.CharacterBioInput);
        inventoryHints[0] = (TextView)view.findViewById(R.id.CurrencyHint);
        inventoryHints[1] = (TextView)view.findViewById(R.id.SPHint);
        inventoryHints[2] = (TextView)view.findViewById(R.id.GPHint);
        inventoryHints[3] = (TextView)view.findViewById(R.id.InventoryHint);
        inventoryHints[4] = (TextView)view.findViewById(R.id.BioHint);

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

        currencyTitle.setTextSize(text35);
        spTitle.setTextSize(text30);
        gpTitle.setTextSize(text30);
        spAmount.setTextSize(text30);
        gpAmount.setTextSize(text30);
        characterInventoryTitle.setTextSize(text35);
        characterBioTitle.setTextSize(text35);
        characterInventoryInput.setTextSize(text30);
        characterBioInput.setTextSize(text30);
        for (TextView InventoryHints : inventoryHints)
        {
            InventoryHints.setTextSize(text25);
        }

        return view;
    }
}
