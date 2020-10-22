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
        Random rand = new Random();
        for (int i = 0; i < mNum; i++)
        {
            Rolls[i] = rand.nextInt(mSides) + 1;
            mSum += Rolls[i];
        }
    }

    void SetNum(int _Num)
    {
        mNum = _Num;
        Rolls = new int[mNum];
    }

    int GetNum()
    {
        return mNum;
    }

    void SetSides(int _Sides)
    {
        mSides = _Sides;
    }

    int GetSides()
    {
        return mSides;
    }

    int GetRolls(int _index)
    {
        return Rolls[_index];
    }

    int GetSum()
    {
        return mSum;
    }
}
