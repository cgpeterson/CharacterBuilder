package com.example.cbandoid.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.cbandoid.AbilityModActivity;
import com.example.cbandoid.AttacksActivity;
import com.example.cbandoid.BasicInfoActivity;
import com.example.cbandoid.InventoryActivity;
import com.example.cbandoid.R;
import com.example.cbandoid.SavingThrowsActivity;
import com.example.cbandoid.SkillsActivity;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4, R.string.tab_text_5,R.string.tab_text_6};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        Fragment frag = null;
        switch(position)
        {
            case 0:
                frag = new BasicInfoActivity();
                break;
            case 1:
                frag = new AbilityModActivity();
                break;
            case 2:
                frag = new SavingThrowsActivity();
                break;
            case 3:
                frag = new SkillsActivity();
                break;
            case 4:
                frag = new AttacksActivity();
                break;
            case 5:
                frag = new InventoryActivity();
                break;
        }
        return frag;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show total number of pages.
        return 6;
    }
}