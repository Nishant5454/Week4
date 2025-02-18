package org.example.annotation.customAnnotation.advanced.RoleAllowed;

import java.lang.annotation.*;

// Custom annotation to restrict access based on roles
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Applicable only to methods
@interface RoleAllowed {
    String value();  // Role required to access the method
}
