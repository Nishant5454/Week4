package org.example.regex.hexadecimalcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hexadecimalcode {
    public static boolean isvalidColor(String color_code){
          String colorRegex="^#[0-9A-Fa-f]{6}$";
        Pattern pattern=Pattern.compile(colorRegex);
        Matcher matcher=pattern.matcher(color_code);
        boolean flag=matcher.matches();
        return flag;
    }


    public static void main(String[] args) {
        System.out.println("Enter the colorCode");
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        if(isvalidColor(string)){
            System.out.println("Color having code "+string+" is valid");
        }
        else{
            System.out.println("Color having code "+string+" is not Valid");
        }


    }
}
/*
A valid hex color:
Starts with a #
Followed by 6 hexadecimal characters (0-9, A-F, a-f).
🔹 Example Inputs & Outputs
✅ "#FFA500" → Valid
✅ "#ff4500" → Valid
❌ "#123" → Invalid (too short)

 */