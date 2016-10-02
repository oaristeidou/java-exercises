package de.oaristeidou.java.exercises.exercise_1.classes;

import de.oaristeidou.java.exercises.exercise_1.interfaces.HexadecimalDigit;

import java.util.ArrayList;

/**
 * Created by odyssefs on 02.10.16.
 */
public class HexadecimalDigit_array implements HexadecimalDigit {
    private static char digit;
    protected static int[] arraxOfDigits = initArrayOfDigits();

    @Override
    public void setDigit(char digit) {
        this.digit = digit;
    }

    @Override
    public int getDecimalValue() {
        return arraxOfDigits[digit];
    }

    private static int[] initArrayOfDigits() {
        int [] tempArray = new int[65536];

        tempArray['0'] = 0;
        tempArray['1'] = 1;
        tempArray['2'] = 2;
        tempArray['3'] = 3;
        tempArray['4'] = 4;
        tempArray['5'] = 5;
        tempArray['6'] = 6;
        tempArray['7'] = 7;
        tempArray['8'] = 8;
        tempArray['9'] = 9;
        tempArray['a'] = 10;
        tempArray['A'] = 10;
        tempArray['b'] = 11;
        tempArray['B'] = 11;
        tempArray['c'] = 12;
        tempArray['C'] = 12;
        tempArray['d'] = 13;
        tempArray['D'] = 13;
        tempArray['e'] = 14;
        tempArray['E'] = 14;
        tempArray['f'] = 15;
        tempArray['F'] = 15;

        return tempArray;
    }
}
