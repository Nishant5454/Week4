package org.example.annotation.customAnnotation.beginner.ImportantMethods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethods{
    String level()
            default "High";
}