package org.example.reflection.Basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;

class Calculator{
    private static int multiply(int a,int b){
        return a*b;
    }
}

public class calculator {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        Calculator c = new Calculator();
        Class<Calculator> cls = Calculator.class;
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(c, 5, 5);
        System.out.println("Multiply value of the values are " + result);


    }
}
