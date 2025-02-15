package org.example.regex.capitalWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class capitalWord {
    public static List<String> printString(String text) {
        String regex = "A\\b[A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> ls = new ArrayList<>();
        while (matcher.find()) {
            ls.add(matcher.group()+" ");
        }
        return ls;
    }

    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        List<String>name=printString(str);
        if(name.isEmpty()){
            System.out.println("No Capital Letter Words are present in String");
        }
        else{
            System.out.println("Extracted words are");
            name.forEach(System.out::println);
        }

    }
}