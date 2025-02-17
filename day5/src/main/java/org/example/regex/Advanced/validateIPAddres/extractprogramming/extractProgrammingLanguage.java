package org.example.regex.Advanced.validateIPAddres.extractprogramming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractProgrammingLanguage {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(?i)\\bJava|Python|Javascript|Go\\b");
        System.out.println("Enter the String Which Hold programming Languages");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Matcher matcher=p.matcher(str);
        while (matcher.find()){
            System.out.println("The Name of the  Programming Language is "+matcher.group());
        }
    }
}
