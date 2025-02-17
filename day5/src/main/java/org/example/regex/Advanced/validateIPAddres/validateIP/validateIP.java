package org.example.regex.Advanced.validateIPAddres.validateIP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateIP {
    public static boolean isvalidateIpaddress(String text) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean flag = matcher.matches();
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Enter the IP Address to check the validation");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isvalidateIpaddress(str)) {
            System.out.println("Ip address having Ip address " + str + " is valid");
        } else {
            System.out.println("Ip address is not valid at all");

        }
    }
}
