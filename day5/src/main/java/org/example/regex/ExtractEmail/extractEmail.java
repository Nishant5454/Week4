package org.example.regex.ExtractEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractEmail {
    public static List<String>extractedEmail(String text){

        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(emailRegex);
        Matcher matcher= pattern.matcher(text);
        List<String>emails=new ArrayList<>();
        while (matcher.find()){
            emails.add(matcher.group());
        }
        return emails;

    }

    public static void main(String[] args) {
        System.out.println("Enter the String");
    // String text="info@org.com abc@gmail.com";
        Scanner sc=new Scanner(System.in);
        String text= sc.nextLine();
     List<String>ls=extractedEmail(text);
     if(ls.isEmpty()){
         System.out.println("No emails present in the String");
     }
     else{
         System.out.println("Extracted Emails are");
         ls.forEach(System.out::println);
     }


    }

   // String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";


}
/*
 Extract All Email Addresses from a Text
🔹 Example Text:
"Contact us at support@example.com and info@company.org"
🔹 Expected Output:
support@example.com
info@company.org

 */