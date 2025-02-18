package org.example.annotation.Basic;

// Class using repeatable annotations
public class RepeatableAnnotation {
    @Bugreport(description = "Null Pointer Issues")
    @Bugreport(description = "Index Out of Bound Exceptions")
    void bugMethod() {
        System.out.println("Bug should be Appeared after each code Testing");
    }
}
