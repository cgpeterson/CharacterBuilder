package com.example.cbandoid;

import java.util.Random;

public class Roller
{
    private int mNum = 1;
    private int mSides = 2;
    private int[] Rolls;
    private int mSum;

    Roller(int _Num, int _Sides)
    {
        if (_Num > 0)
            mNum = _Num;
        if (_Sides > 1)
            mSides = _Sides;
        Rolls = new int[mNum];
    }

    void Rolling()
    {
        mSum = 0;
        for (int i = 0; i < mNum; i++)
        {
            Random rand = new Random();
            Rolls[i] = rand.nextInt(mSides) + 1;
            mSum += Rolls[i];
        }
    }

    int GetNum()
    {
        return mNum;
    }

    int GetSides()
    {
        return mSides;
    }

    String GetRolls()
    {
        String rolls = "";

        for (int i = 0; i < Rolls.length; i++)
        {
            rolls += Rolls[i] + " ";
        }

        return rolls;
    }

    int GetSum()
    {
        return mSum;
    }
}
