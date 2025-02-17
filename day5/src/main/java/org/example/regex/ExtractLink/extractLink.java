package org.example.regex.ExtractLink;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractLink {
    //public static List<String>extractedHttpssites(String str){
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\bhttps?://(www\\.)?[a-zA-Z0-9.-]+\\.[a-z]{2,}\\b");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Matcher m= p.matcher(str);
        while (m.find()){
            System.out.println("The value of the https is "+m.group()+" ");


    }
    }

}
