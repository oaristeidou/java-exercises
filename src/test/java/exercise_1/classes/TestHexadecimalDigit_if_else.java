package exercise_1.classes;

import de.oaristeidou.java.exercises.exercise_1.classes.HexadecimalDigit_if_else;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 * Created by odyssefs on 02.10.16.
 */
public class TestHexadecimalDigit_if_else {

    @Test
    public static void testHexadecimalDigit_if_else (){

        HexadecimalDigit_if_else hexIfStatement = new HexadecimalDigit_if_else();
        Random random = new Random();
        String range = "0123456789abcdef";

        for (int i = 0; i<= HexadecimalDigit_if_else.loopInterations; i++){
            int randomNumber = range.charAt(random.nextInt(range.length()));
            hexIfStatement.setDigit((char)randomNumber);
            assertEquals (hexIfStatement.getDecimalValue(), hexIfStatement.getDecimalValue());
        }
        System.out.println("The average time using an if statement is: " + TimeUnit.SECONDS.convert(System.nanoTime()/ HexadecimalDigit_if_else.loopInterations, TimeUnit.NANOSECONDS));
    }


}
