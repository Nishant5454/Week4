package org.example.regex.ReplaceandModify.removeSpace.censorBadWord;

import java.util.Scanner;

public class censorBadWord {
    public static void main(String[] args) {
        System.out.println("Enter the String that holds Bad Words");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]badwords={"Damn","Stupid","Idiot"};
        for (String s:badwords){
            str=str.replaceAll("(?i)\\b"+s+"\\b","*********");

        }
        System.out.println("The resultent String value is "+str);


    }
}
