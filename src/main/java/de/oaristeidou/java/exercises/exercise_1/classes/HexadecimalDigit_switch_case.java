package de.oaristeidou.java.exercises.exercise_1.classes;

import de.oaristeidou.java.exercises.exercise_1.interfaces.HexadecimalDigit;

/**
 * Created by odyssefs on 02.10.16.
 */
public class HexadecimalDigit_switch_case implements HexadecimalDigit{

    private static char digit;

    @Override
    public void setDigit(char digit) {
        this.digit = digit;
    }

    @Override
    public int getDecimalValue() {
        switch (digit){
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'a':
                return 10;
            case 'B':
                return 11;
            case 'b':
                return 11;
            case 'C':
                return 12;
            case 'c':
                return 12;
            case 'D':
                return 13;
            case 'd':
                return 13;
            case 'E':
                return 14;
            case 'e':
                return 14;
            case 'F':
                return 15;
            case 'f':
                return 15;
            default:
                return -1;
        }

    }
}
