package org.example.regex.Licenceplate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class liceneceplate {
    public static boolean isvalidplateNumber(String plateNumber){
        String plate_Regex="^[A-Z]{2}[0-9]{4}";
        Pattern pattern=Pattern.compile(plate_Regex);
        Matcher matcher=pattern.matcher(plateNumber);
        boolean flag=matcher.matches();
        return flag;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plateNumber");
        String str=sc.nextLine();
        if(isvalidplateNumber(str)){
            System.out.println("Vechicle having Number "+str+" is valid");
        }
        else{
            System.out.println("Vechicle having Number "+str+" is Not valid");
        }

    }
}
