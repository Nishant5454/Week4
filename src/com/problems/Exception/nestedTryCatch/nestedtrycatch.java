package com.problems.Exception.nestedTryCatch;

import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Array");
            int sizeOfArray = sc.nextInt();
            int[] arr = new int[sizeOfArray];
            System.out.println("Enter element in Array");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index no for the element");

            int indexElement = sc.nextInt();
            System.out.println("Enter the divisor number");
            int divisor= sc.nextInt();
            int result = arr[indexElement];
            System.out.println("The element at index " + indexElement + " is " + result);
            System.out.println("The result of divsior the element "+result+" is "+result/divisor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index of Bound");
        }
        catch (ArithmeticException e){
            System.out.println("Number cant be divided by zero");
        }
        finally {
            System.out.println("Operation processd Sucsessfully");
        }


    }

}
