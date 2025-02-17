package JUnit.testing.calculator.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void divideValue(int a,int b) {
        try {
            System.out.println("The divide value for the Number " + a + " and the Number " + b + " is " + a / b);

        } catch (ArithmeticException e) {
            if (b == 0) {
                System.out.println("The numbers cant be divided");
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the First Number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2= sc.nextInt();
        divideValue(num1,num2);

    }
}
