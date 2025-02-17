package org.example.reflection.Basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class classInfo {
    public static void main(String[] args) {
        System.out.println("Enter the Class name");
        Scanner sc=new Scanner(System.in);
        String classname=sc.nextLine();
        try{
            Class<?>cls=Class.forName(classname);
            System.out.println("The name of the class is "+cls.getName());
            for(Method method:cls.getDeclaredMethods()){
                System.out.println("The name of the Method is "+method);
            }
            for(Constructor constructor:cls.getConstructors()){
                System.out.println("The name of the Constructor is "+constructor);
            }
            for(Field field:cls.getDeclaredFields()){
                System.out.println("The fields in the constructors are "+field);
            }



        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}
