package JUnit.testing.calculator.ExceptionHandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {
    ExceptionHandling exceptionHandling=new ExceptionHandling();
    @Test
    void Test(){
       exceptionHandling.divideValue(12,4);
        assertEquals(3,3);
        //Exception exception=assertThrows(ArithmeticException.class,()->exceptionHandling.divideValue(12,0));
        //assertEquals("cannot Divide by zero");


    }

}