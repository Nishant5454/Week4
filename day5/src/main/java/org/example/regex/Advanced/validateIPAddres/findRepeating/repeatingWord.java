package org.example.regex.Advanced.validateIPAddres.findRepeating;

import java.util.regex.Pattern;
import java.util.Scanner;
import  java.util.regex.Matcher;

public class repeatingWord {
    public static void main(String[] args) {


        Pattern p = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)+");
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a text");
        String input = cs.nextLine();
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("Matches : " + m.group());

        }
    }
}
