package com.problems.Exception.customException;

import java.util.Scanner;

class invalidAgeException extends Exception{
    public invalidAgeException(String message){
        super(message);
    }
    public String getMessage(String message){
        return message;
    }
}



public class customException {
    public static void main(String[] args) {
        canVote();
    }
    public static void canVote(){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your age");
            int age=sc.nextInt();
            validateage(age);
            System.out.println("Age Granted");



        }
        catch (invalidAgeException e){
            System.out.println("Age not granted");
        }
    }
    public static void validateage(int age)throws invalidAgeException{
        if(age<18){
            throw new invalidAgeException("Age not validate for Voting");
        }
    }

}
