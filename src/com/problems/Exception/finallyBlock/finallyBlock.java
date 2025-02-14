package com.problems.Exception.finallyBlock;

import java.util.Scanner;

public class finallyBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd Number");
        int num2=sc.nextInt();
        try{
            System.out.println("The result of the dividend is "+num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("Number cant be divided by zero");
        }
        finally {
            System.out.println("Operation Completed Sucsessfully");
        }

    }
}
