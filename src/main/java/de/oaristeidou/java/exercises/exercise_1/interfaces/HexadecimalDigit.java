package de.oaristeidou.java.exercises.exercise_1.interfaces;

/**
 * Created by odyssefs on 02.10.16.
 */
public interface HexadecimalDigit {

    int loopInterations = 1000;

    // set the digit to a new digit from the value range '0'-'9', 'a'-'f', or 'A'-'F'
    void setDigit(char digit);
    // returns the decimal value of the digit: 0 to 15. The digits are not case sensitive. If the digit is not in the correct range, -1 is returned.
    int getDecimalValue();
}
