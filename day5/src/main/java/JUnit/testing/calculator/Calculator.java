package JUnit.testing.calculator;

import java.util.Scanner;

public class Calculator {
    public static int addition(int a,int b){
        return a+b;
    }
    public static int subtraction(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static int  division(int a,int b){
        if(b==0)
            throw new ArithmeticException("Number cant be divided via zero");

        return a/b;

    }

    public static void main(String[] args) {
        System.out.println("Enter first Number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();
        System.out.println("The addition is "+addition(a,b));
        System.out.println("The Subtraction is "+subtraction(a,b));
        System.out.println("The multiplication is "+multiplication(a,b));
        System.out.println("The division is "+division(a,b));


    }
}
