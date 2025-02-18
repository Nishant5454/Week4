package org.example.annotation.customAnnotation.beginner.ImportantMethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Taskservice>ts= Taskservice.class;
        for(Method method:ts.getDeclaredMethods()){
            if(method.isAnnotationPresent(ImportantMethods.class)){
                ImportantMethods annotation=method.getAnnotation(ImportantMethods.class);
                System.out.println("The name of the Method is "+method.getName()+"and the Level is "+annotation.level());
            }


        }
    }
}
