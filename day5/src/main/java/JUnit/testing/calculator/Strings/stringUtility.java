package JUnit.testing.calculator.Strings;

import java.util.Locale;
import java.util.Scanner;

public class stringUtility {
    public static void reverseString(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        System.out.println("The reverse String is " + ans);

    }

    public static void isPalindrome(String str) {
        String initialResult = str;
        StringBuilder ans=new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ans.append(str.charAt(i));
        }
        if(initialResult.equals(ans.toString())){
            System.out.println("String "+str+" is palindrome");
        }
        else{
            System.out.println("String "+str+" is not palindrome");
        }
    }

    public static String toUppercase(String str) {
        return str.toUpperCase();
    }


    public static void main(String[] args) {
        stringUtility st=new stringUtility();
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverseString(str);
        isPalindrome(str);
        String finalUppercaseResult=toUppercase(str);
        System.out.println(finalUppercaseResult);



    }
}
/*
Create a StringUtils class with the following methods:
reverse(String str): Returns the reverse of a given string.
isPalindrome(String str): Returns true if the string is a palindrome.
toUpperCase(String str): Converts a string to uppercase.
Write JUnit test cases to verify that these methods work correctly.

 */