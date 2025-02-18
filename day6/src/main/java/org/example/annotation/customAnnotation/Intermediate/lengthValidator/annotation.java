package org.example.annotation.customAnnotation.Intermediate.lengthValidator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface annotation {
    int value();
}