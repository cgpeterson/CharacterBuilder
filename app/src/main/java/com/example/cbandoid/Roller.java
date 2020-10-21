package com.example.cbandoid;

import java.util.Random;

public class Roller
{
    int mNum = 1;
    int mSides = 2;
    int[] Rolls;
    int mSum;

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
        for (int i = 0; i < mNum; i++)
        {
            Random rand = new Random();
            Rolls[i] = rand.nextInt(mSides) + 1;
            mSum += Rolls[i];
        }
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
