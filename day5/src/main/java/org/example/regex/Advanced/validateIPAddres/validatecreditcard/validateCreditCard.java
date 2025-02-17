package org.example.regex.Advanced.validateIPAddres.validatecreditcard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateCreditCard {
    public static boolean isvalidCreditCard(String text){
        String regex="^(4\\d{15}|5\\d{15})$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        boolean flag= matcher.find();
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Enter the String for checking the validation of Credit Card");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        if(isvalidCreditCard(str)){
            System.out.println("Credit card having number"+str+" is valid");
        }
        else{
            System.out.println("Credit card is Not Valid");
        }
    }
}
