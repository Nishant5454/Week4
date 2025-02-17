package JUnit.testing.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    @Test
    void Test(){
        Calculator c=new Calculator();
        assertEquals(6,c.addition(3,3));
        assertEquals(-2,c.subtraction(1,3));
        assertEquals(9,c.multiplication(3,3));
        assertEquals(1,c.division(3,3));


    }

}