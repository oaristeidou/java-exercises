package exercise_1.classes;

import de.oaristeidou.java.exercises.exercise_1.classes.HexadecimalDigit_array;
import de.oaristeidou.java.exercises.exercise_1.classes.HexadecimalDigit_switch_case;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 * Created by odyssefs on 02.10.16.
 */
public class TestHexadecimalDigit_array {

    @Test
    public static void testHexadecimalDigit_array (){

        HexadecimalDigit_array hexadecimalDigitArray = new HexadecimalDigit_array();
        Random random = new Random();
        String range = "0123456789abcdef";

        for (int i = 0 ; i<= HexadecimalDigit_array.loopInterations ; i++){
            int randomNumber = range.charAt(random.nextInt(range.length()));
            hexadecimalDigitArray.setDigit((char)randomNumber);
            assertEquals (hexadecimalDigitArray.getDecimalValue(), hexadecimalDigitArray.getDecimalValue());
        }
        System.out.println("The average time using an array is: " + TimeUnit.SECONDS.convert(System.nanoTime()/ hexadecimalDigitArray.loopInterations, TimeUnit.NANOSECONDS));
    }

}
