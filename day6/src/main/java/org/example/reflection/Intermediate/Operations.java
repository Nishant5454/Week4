package org.example.reflection.Intermediate;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

class MathOperations{

    public static int addition(int x,int y){
        return x+y;
    }
    public static int subtraction(int x,int y){
        return x-y;
    }
    public static int multiplication(int x,int y){
        return x*y;
    }



}

public class Operations {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner sc=new Scanner(System.in);
        Class<?>cls=Class.forName("org.example.reflection.Intermediate.MathOperations");
        String input=sc.nextLine();
        int a = sc.nextInt();
        int b=sc.nextInt();
       Object result= cls.getDeclaredMethod(input,int.class,int.class).invoke(null,a,b);
        System.out.println(result);



    }


}
/*
Dynamic Method Invocation: Define a class MathOperations with multiple public methods (add, subtract, multiply). Use Reflection to dynamically call any method based on user input.

 */