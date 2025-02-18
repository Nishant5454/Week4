
package org.example.annotation.customAnnotation.Intermediate.lengthValidator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}
