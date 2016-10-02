package exercise_1.classes;

import org.testng.annotations.Test;

/**
 * Created by odyssefs on 02.10.16.
 */
public class TestMain {
    @Test
    public static void testAllHexadecimalMethods (){
        TestHexadecimalDigit_if_else.testHexadecimalDigit_if_else();
        TestHexadecimalDigit_switch_case.testHexadecimalDigit_switch_case();
        TestHexadecimalDigit_array.testHexadecimalDigit_array();
    }
}
