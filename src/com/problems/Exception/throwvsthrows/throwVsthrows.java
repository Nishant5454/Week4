package com.problems.Exception.throwvsthrows;

import java.util.Scanner;

public class throwVsthrows {
    static double calculateIntrest(double amount,double rate,int Years){
        if(rate<0||amount<0){
            throw new IllegalArgumentException("Input not valid");
        }
        else{
            return (amount*rate*Years)/100;

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount= sc.nextDouble();
        System.out.println("Enter the rate");
        double rate= sc.nextDouble();
        System.out.println("Enter the Years");
        int years=sc.nextInt();
        System.out.println("Total calculated intrest is "+calculateIntrest(amount,rate,years));
    }
}
