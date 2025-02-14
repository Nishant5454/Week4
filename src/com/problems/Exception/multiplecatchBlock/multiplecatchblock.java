package com.problems.Exception.multiplecatchBlock;

import java.util.Scanner;

public class multiplecatchblock {
    public static void main(String[] args) {
        System.out.println("Put the value in the Array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try {
            int indexNumber=sc.nextInt();
            System.out.println("The element at index"+indexNumber+" is "+arr[indexNumber]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Element in the array is out of Bound");
        }
        catch (NullPointerException e){
            System.out.println("Array is Not Intialised");
        }
        finally {
            System.out.println("Code executed sucsessfully");
        }
    }
}
