package org.example.annotation.Basic;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Bugreports.class)
@interface Bugreport {
    String description() default "None";
}

// Define the container annotation for repeatable usage
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Bugreports {
    Bugreport[] value();
}

// Class to process the annotations using Reflection
public class BugReport {
    public static void main(String[] args) {
        try {
            Method method = RepeatableAnnotation.class.getDeclaredMethod("bugMethod");

            // Check if the method has the @Bugreports annotation
            if (method.isAnnotationPresent(Bugreports.class)) {
                Bugreports bugReports = method.getAnnotation(Bugreports.class);

                // Iterate through all @Bugreport annotations
                for (Bugreport bugReport : bugReports.value()) {
                    System.out.println("Bug report: " + bugReport.description());
                }
            } else {
                System.out.println("No bugs found.");
            }

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
