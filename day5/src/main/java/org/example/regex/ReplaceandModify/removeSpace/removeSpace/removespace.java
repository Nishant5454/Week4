package org.example.regex.ReplaceandModify.removeSpace;

import java.util.Scanner;

public class removespace {
    public static void main(String[] args) {
        System.out.println("Enter the String value");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String output=str.replaceAll("\\s+"," ");
        System.out.println(output);


    }
}
