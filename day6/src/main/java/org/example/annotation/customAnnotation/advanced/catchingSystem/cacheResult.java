package org.example.annotation.customAnnotation.advanced.catchingSystem;

import java.lang.annotation.*;

// Define @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Can only be applied to methods
@interface CacheResult {
}
