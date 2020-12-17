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

public class SkillsActivity extends Fragment
{

    TextView skillsTitle;
    TextView skillsTotalTitle;
    TextView skillsAbilityTitle;
    TextView skillsRankTitle;
    EditText[] SkillRanks = new EditText[18];
    TextView[] SkillTotals = new TextView[18];
    TextView[] SkillAbilities = new TextView[18];
    TextView[] SkillTitles = new TextView[18];
    TextView[] skillHints = new TextView[19];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.charprompt_skills, container, false);

        skillsTitle = (TextView)view.findViewById(R.id.SkillsTitle);
        skillsTotalTitle = (TextView)view.findViewById(R.id.SkillsTotalTitle);
        skillsAbilityTitle = (TextView)view.findViewById(R.id.SkillsAbilityTitle);
        skillsRankTitle = (TextView)view.findViewById(R.id.SkillsRankTitle);
        SkillTotals[0] = (TextView)view.findViewById(R.id.AcrobaticsTotal);
        SkillTotals[1] = (TextView)view.findViewById(R.id.ArcanaTotal);
        SkillTotals[2] = (TextView)view.findViewById(R.id.ArcanaTotal);
        SkillTotals[3] = (TextView)view.findViewById(R.id.AthleticsTotal);
        SkillTotals[4] = (TextView)view.findViewById(R.id.DeceptionTotal);
        SkillTotals[5] = (TextView)view.findViewById(R.id.HistoryTotal);
        SkillTotals[6] = (TextView)view.findViewById(R.id.InsightTotal);
        SkillTotals[7] = (TextView)view.findViewById(R.id.IntimidationTotal);
        SkillTotals[8] = (TextView)view.findViewById(R.id.InvestigationTotal);
        SkillTotals[9] = (TextView)view.findViewById(R.id.MedicineTotal);
        SkillTotals[10] = (TextView)view.findViewById(R.id.NatureTotal);
        SkillTotals[11] = (TextView)view.findViewById(R.id.PerceptionTotal);
        SkillTotals[12] = (TextView)view.findViewById(R.id.PerformanceTotal);
        SkillTotals[13] = (TextView)view.findViewById(R.id.PersuasionTotal);
        SkillTotals[14] = (TextView)view.findViewById(R.id.ReligionTotal);
        SkillTotals[15] = (TextView)view.findViewById(R.id.SleightHandTotal);
        SkillTotals[16] = (TextView)view.findViewById(R.id.StealthTotal);
        SkillTotals[17] = (TextView)view.findViewById(R.id.SurvivalTotal);
        SkillAbilities[0] = (TextView)view.findViewById(R.id.AcrobaticsAbility);
        SkillAbilities[1] = (TextView)view.findViewById(R.id.AnimalHandAbility);
        SkillAbilities[2] = (TextView)view.findViewById(R.id.ArcanaAbility);
        SkillAbilities[3] = (TextView)view.findViewById(R.id.AthleticsAbility);
        SkillAbilities[4] = (TextView)view.findViewById(R.id.DeceptionAbility);
        SkillAbilities[5] = (TextView)view.findViewById(R.id.HistoryAbility);
        SkillAbilities[6] = (TextView)view.findViewById(R.id.InsightAbility);
        SkillAbilities[7] = (TextView)view.findViewById(R.id.IntimidationAbility);
        SkillAbilities[8] = (TextView)view.findViewById(R.id.InvestigationAbility);
        SkillAbilities[9] = (TextView)view.findViewById(R.id.MedicineAbility);
        SkillAbilities[10] = (TextView)view.findViewById(R.id.NatureAbility);
        SkillAbilities[11] = (TextView)view.findViewById(R.id.PerceptionAbility);
        SkillAbilities[12] = (TextView)view.findViewById(R.id.PerformanceAbility);
        SkillAbilities[13] = (TextView)view.findViewById(R.id.PersuasionAbility);
        SkillAbilities[14] = (TextView)view.findViewById(R.id.ReligionAbiltiy);
        SkillAbilities[15] = (TextView)view.findViewById(R.id.SleightHandAbility);
        SkillAbilities[16] = (TextView)view.findViewById(R.id.StealthAbility);
        SkillAbilities[17] = (TextView)view.findViewById(R.id.SurvivalAbility);
        SkillRanks[0] = (EditText)view.findViewById(R.id.AcrobaticsRank);
        SkillRanks[1] = (EditText)view.findViewById(R.id.AnimalHandRank);
        SkillRanks[2] = (EditText)view.findViewById(R.id.ArcanaRank);
        SkillRanks[3] = (EditText)view.findViewById(R.id.AthleticsRank);
        SkillRanks[4] = (EditText)view.findViewById(R.id.DeceptionRank);
        SkillRanks[5] = (EditText)view.findViewById(R.id.HistoryRank);
        SkillRanks[6] = (EditText)view.findViewById(R.id.InsightRank);
        SkillRanks[7] = (EditText)view.findViewById(R.id.IntimidationRank);
        SkillRanks[8] = (EditText)view.findViewById(R.id.InvestigationRank);
        SkillRanks[9] = (EditText)view.findViewById(R.id.MedicineRank);
        SkillRanks[10] = (EditText)view.findViewById(R.id.NatureRank);
        SkillRanks[11] = (EditText)view.findViewById(R.id.PerceptionRank);
        SkillRanks[12] = (EditText)view.findViewById(R.id.PerformanceRank);
        SkillRanks[13] = (EditText)view.findViewById(R.id.PersuasionRank);
        SkillRanks[14] = (EditText)view.findViewById(R.id.ReligionRank);
        SkillRanks[15] = (EditText)view.findViewById(R.id.SleightHandRank);
        SkillRanks[16] = (EditText)view.findViewById(R.id.StealthRank);
        SkillRanks[17] = (EditText)view.findViewById(R.id.SurvivalRank);
        SkillTitles[0] = (TextView)view.findViewById(R.id.AcrobaticsTitle);
        SkillTitles[1] = (TextView)view.findViewById(R.id.AnimalHandTitle);
        SkillTitles[2] = (TextView)view.findViewById(R.id.ArcanaTitle);
        SkillTitles[3] = (TextView)view.findViewById(R.id.AthleticsTitle);
        SkillTitles[4] = (TextView)view.findViewById(R.id.DeceptionTitle);
        SkillTitles[5] = (TextView)view.findViewById(R.id.HistoryTitle);
        SkillTitles[6] = (TextView)view.findViewById(R.id.InsightTitle);
        SkillTitles[7] = (TextView)view.findViewById(R.id.IntimidationTitle);
        SkillTitles[8] = (TextView)view.findViewById(R.id.InvestigationTitle);
        SkillTitles[9] = (TextView)view.findViewById(R.id.MedicineTitle);
        SkillTitles[10] = (TextView)view.findViewById(R.id.NatureTitle);
        SkillTitles[11] = (TextView)view.findViewById(R.id.PerceptionTitle);
        SkillTitles[12] = (TextView)view.findViewById(R.id.PerformanceTitle);
        SkillTitles[13] = (TextView)view.findViewById(R.id.PersuasionTitle);
        SkillTitles[14] = (TextView)view.findViewById(R.id.ReligionTitle);
        SkillTitles[15] = (TextView)view.findViewById(R.id.SleightHandTitle);
        SkillTitles[16] = (TextView)view.findViewById(R.id.StealthTitle);
        SkillTitles[17] = (TextView)view.findViewById(R.id.SurvivalTitle);
        skillHints[0] = (TextView)view.findViewById(R.id.SkillsHint);
        skillHints[1] = (TextView)view.findViewById(R.id.AcrobaticsHint);
        skillHints[2] = (TextView)view.findViewById(R.id.AnimalHandHint);
        skillHints[3] = (TextView)view.findViewById(R.id.ArcanaHint);
        skillHints[4] = (TextView)view.findViewById(R.id.AthleticsHint);
        skillHints[5] = (TextView)view.findViewById(R.id.DeceptionHint);
        skillHints[6] = (TextView)view.findViewById(R.id.HistoryHint);
        skillHints[7] = (TextView)view.findViewById(R.id.InsightHint);
        skillHints[8] = (TextView)view.findViewById(R.id.IntimidationHint);
        skillHints[9] = (TextView)view.findViewById(R.id.InvestigationHint);
        skillHints[10] = (TextView)view.findViewById(R.id.MedicineHint);
        skillHints[11] = (TextView)view.findViewById(R.id.NatureHint);
        skillHints[12] = (TextView)view.findViewById(R.id.PerceptionHint);
        skillHints[13] = (TextView)view.findViewById(R.id.PerformanceHint);
        skillHints[14] = (TextView)view.findViewById(R.id.PersuasionHint);
        skillHints[15] = (TextView)view.findViewById(R.id.ReligionHint);
        skillHints[16] = (TextView)view.findViewById(R.id.SleightHandHint);
        skillHints[17] = (TextView)view.findViewById(R.id.StealthHint);
        skillHints[18] = (TextView)view.findViewById(R.id.SurvivalHint);

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

        skillsTitle.setTextSize(text35);
        skillsTotalTitle.setTextSize(text30);
        skillsAbilityTitle.setTextSize(text30);
        skillsRankTitle.setTextSize(text30);
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
        for (TextView SkillHints : skillHints)
        {
            SkillHints.setTextSize(text25);
        }

        return view;
    }
}
