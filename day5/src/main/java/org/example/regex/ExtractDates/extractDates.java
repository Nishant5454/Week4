package org.example.regex.ExtractDates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractDates {
    public static void extractDates(String date){
    String dateRegex="\\b\\d{2}/\\d{2}/\\d{4}\\b";
    Pattern pattern=Pattern.compile(dateRegex);
    Matcher matcher= pattern.matcher(date);
    while (matcher.find()){
        System.out.println(matcher.group()+" ");
    }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter the Date");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        extractDates(str);
    }
}