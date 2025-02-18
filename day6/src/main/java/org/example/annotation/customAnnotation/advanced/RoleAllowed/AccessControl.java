package org.example.annotation.customAnnotation.advanced.RoleAllowed;

import java.lang.reflect.Method;

public class AccessControl {
    public static void main(String[] args) {
        User currentUser = new User("USER"); // Change role to "ADMIN" to test access

        SecureService service = new SecureService();
        executeMethodIfAllowed(service, "adminTask", currentUser);
        executeMethodIfAllowed(service, "userTask", currentUser);
    }

    public static void executeMethodIfAllowed(Object obj, String methodName, User user) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);

                // Check if the user has the required role
                if (annotation.value().equals(user.getRole())) {
                    method.invoke(obj);  // Execute method
                } else {
                    System.out.println("Access Denied! " + user.getRole() + " cannot execute " + methodName);
                }
            } else {
                method.invoke(obj);  // Execute if no restriction
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
