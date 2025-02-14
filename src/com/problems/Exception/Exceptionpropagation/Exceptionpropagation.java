package com.problems.Exception.Exceptionpropagation;

import java.util.Scanner;

public class Exceptionpropagation {
   public  static int method1(int num1,int num2){
        return num1/num2;
    }
    public static int method2(int n1,int n2){
        System.out.println("Method 2"); 
       return method1(n1,n2);
    }

public static void main(String[] args) {

    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1= sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2= sc.nextInt();
        System.out.println("The division of "+num1+" and the "+num2+" is "+method2(num1,num2));
    }
    catch (ArithmeticException e){
        System.out.println("Number cant be divided via zero");
    }
    finally {
        System.out.println("Process finally Executed");
    }
    }

    
}
