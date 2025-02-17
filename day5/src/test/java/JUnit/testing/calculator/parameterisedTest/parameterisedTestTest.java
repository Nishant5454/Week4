package JUnit.testing.calculator.parameterisedTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static JUnit.testing.calculator.parameterisedTest.parameterisedTest.isEven;
import static org.junit.jupiter.api.Assertions.*;

class ParameterisedTestTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})  // Even numbers
    void testIsEven(int number) {
        assertTrue(isEven(number), "Number " + number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})  // Odd numbers
    void testIsOdd(int number) {
        boolean expected = (number%2==0);
        boolean actual = isEven(number);
        assertFalse(isEven(number), "Number " + number + " should be odd");
    }


}
