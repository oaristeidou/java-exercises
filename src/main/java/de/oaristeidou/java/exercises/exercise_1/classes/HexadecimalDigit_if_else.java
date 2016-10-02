package de.oaristeidou.java.exercises.exercise_1.classes;

import de.oaristeidou.java.exercises.exercise_1.interfaces.HexadecimalDigit;

/**
 * Created by odyssefs on 02.10.16.
 */
public class HexadecimalDigit_if_else implements HexadecimalDigit {

    private static char digit;

    @Override
    public void setDigit(char digit) {
        this.digit = digit;
    }

    @Override
    public int getDecimalValue() {
        if ('0' == digit)
            return 0;
        else if ('1' == digit)
            return 1;
        else if ('2' == digit)
            return 2;
        else if ('3' == digit)
            return 3;
        else if ('4' == digit)
            return 4;
        else if ('5' == digit)
            return 5;
        else if ('6' == digit)
            return 6;
        else if ('7' == digit)
            return 7;
        else if ('8' == digit)
            return 8;
        else if ('9' == digit)
            return 9;
        else if ('A' == digit || 'a' == digit)
            return 10;
        else if ('B' == digit || 'b' == digit)
            return 11;
        else if ('C' == digit || 'c' == digit)
            return 12;
        else if ('D' == digit || 'd' == digit)
            return 13;
        else if ('E' == digit || 'e' == digit)
            return 14;
        else if ('F' == digit || 'f' == digit)
            return 15;

        return -1;
    }
}
