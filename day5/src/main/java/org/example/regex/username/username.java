package org.example.regex.username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class username {
    public static final String userName_Regex="^[a-zA-z][a-zA-Z0-9_]{4,14}$";
    public static boolean isvalidation(String userName){
        return Pattern.matches(userName_Regex,userName);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String as userName");
        String username=sc.nextLine();
        if(isvalidation(username)){
            System.out.println(username+" "+" is valid");
        }
        else{
            System.out.println(username+" "+" is not valid");
        }


    }

}
/*
1️⃣ Validate a Username
A valid username:
Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
Must start with a letter
Must be between 5 to 15 characters long
🔹 Example Inputs & Outputs
✅ "user_123" → Valid
❌ "123user" → Invalid (starts with a number)
❌ "us" → Invalid (too short)

 */