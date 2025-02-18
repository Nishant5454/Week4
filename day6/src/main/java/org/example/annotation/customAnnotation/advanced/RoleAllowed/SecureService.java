package org.example.annotation.customAnnotation.advanced.RoleAllowed;

// Service class with restricted methods
public class SecureService {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully.");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed successfully.");
    }
}
