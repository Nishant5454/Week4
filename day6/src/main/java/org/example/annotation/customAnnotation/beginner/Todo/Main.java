package org.example.annotation.customAnnotation.beginner.Todo;

import org.example.annotation.customAnnotation.beginner.ImportantMethods.ImportantMethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<multipleMethods>mm= multipleMethods.class;
        for(Method method:mm.getDeclaredMethods()){
            if(method.isAnnotationPresent(Todo.class)){
                Todo annotation=method.getAnnotation(Todo.class);
                System.out.println("The name of the Method is "+method.getName()+"and the name of the Annotation is "+annotation.task()+"and the position is assigned to "+annotation.assignedTo());




            }
        }
    }
}
