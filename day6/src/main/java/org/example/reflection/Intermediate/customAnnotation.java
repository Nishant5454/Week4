package org.example.reflection.Intermediate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name() default "None";
}

// Apply annotation
@Author(name = "Nishant")
public class customAnnotation {
    public static void main(String[] args) {
        // Get class reference
        Class<?> cls = customAnnotation.class;

        // Retrieve and print annotation value
        Author author = cls.getAnnotation(Author.class);
        if (author != null) {
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}
