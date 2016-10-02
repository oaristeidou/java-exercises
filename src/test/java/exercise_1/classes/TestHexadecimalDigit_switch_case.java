package exercise_1.classes;

import de.oaristeidou.java.exercises.exercise_1.classes.HexadecimalDigit_if_else;
import de.oaristeidou.java.exercises.exercise_1.classes.HexadecimalDigit_switch_case;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 * Created by odyssefs on 02.10.16.
 */
public class TestHexadecimalDigit_switch_case {


    @Test
    public static void testHexadecimalDigit_switch_case (){

        HexadecimalDigit_switch_case hexadecimalDigitSwitchCase = new HexadecimalDigit_switch_case();
        Random random = new Random();
        String range = "0123456789abcdef";

        for (int i = 0 ; i<= HexadecimalDigit_switch_case.loopInterations ; i++){
            int randomNumber = range.charAt(random.nextInt(range.length()));
            hexadecimalDigitSwitchCase.setDigit((char)randomNumber);
            assertEquals (hexadecimalDigitSwitchCase.getDecimalValue(), hexadecimalDigitSwitchCase.getDecimalValue());
        }
        System.out.println("The average time using a switch case is: " + TimeUnit.SECONDS.convert(System.nanoTime()/ HexadecimalDigit_switch_case.loopInterations, TimeUnit.NANOSECONDS));
    }
}
