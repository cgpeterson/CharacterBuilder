package com.example.cbandoid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileAdapter extends BaseExpandableListAdapter
{

    Context context;
    List<String> ruleSet;
    Map<String,List<String>> characters;

    public ProfileAdapter(Context context, List<String> ruleSet, Map<String, List<String>> characters) {
        this.context = context;
        this.ruleSet = ruleSet;
        this.characters = characters;
    }

    @Override
    public int getGroupCount()
    {
        return ruleSet.size();
    }

    @Override
    public int getChildrenCount(int groupPosition)
    {
        return characters.get(ruleSet.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return ruleSet.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition)
    {
        return characters.get(ruleSet.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition)
    {
        return childPosition;
    }

    @Override
    public boolean hasStableIds()
    {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
    {
        String ruleTitle = (String) getGroup(groupPosition);

        if (convertView == null)
        {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflate.inflate(R.layout.profile_rulset, null);
        }

        TextView ruleText = (TextView) convertView.findViewById(R.id.RulsetText);
        ruleText.setText(ruleTitle);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
    {
        String character = (String) getChild(groupPosition, childPosition);

        if (convertView == null)
        {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflate.inflate(R.layout.profile_characters, null);
        }

        TextView charText = (TextView) convertView.findViewById(R.id.CharText);
        charText.setText(character);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition)
    {
        return true;
    }
}
