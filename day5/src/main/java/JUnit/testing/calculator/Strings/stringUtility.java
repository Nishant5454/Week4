package JUnit.testing.calculator.Strings;

import java.util.Scanner;

public class stringUtility {
    public static String reverseString(String str) {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();


    }

    public static boolean isPalindrome(String str) {
        String result=reverseString(str);
        return str.equals(result);
    }

    public static String toUppercase(String str) {
        return str.toUpperCase();
    }


    public static void main(String[] args) {
        stringUtility st=new stringUtility();
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       String result= reverseString(str);
        System.out.println("The reverse String value is "+result);
        if(isPalindrome(str)){
            System.out.println("String "+str+" is palindrome");
        }
        else{
            System.out.println("String "+str+" is not palindrome");
        }
        String finalUppercaseResult=toUppercase(str);
        System.out.println("The upperCase of the String is "+finalUppercaseResult);



    }
}
/*
Create a StringUtils class with the following methods:
reverse(String str): Returns the reverse of a given string.
isPalindrome(String str): Returns true if the string is a palindrome.
toUpperCase(String str): Converts a string to uppercase.
Write JUnit test cases to verify that these methods work correctly.

 */