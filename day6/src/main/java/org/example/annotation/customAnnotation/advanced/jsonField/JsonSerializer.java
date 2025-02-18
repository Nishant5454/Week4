package org.example.annotation.customAnnotation.advanced.jsonField;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    public static String toJson(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            Map<String, Object> jsonMap = new HashMap<>();

            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true); // Allow access to private fields

                // Check if field has @JsonField annotation
                if (field.isAnnotationPresent(JsonField.class)) {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    jsonMap.put(annotation.name(), field.get(obj)); // Use custom JSON key
                }
            }

            // Convert map to JSON string
            return jsonMap.toString().replace("=", ":"); // Simple JSON formatting
        } catch (Exception e) {
            throw new RuntimeException("Error serializing object to JSON", e);
        }
    }

    public static void main(String[] args) {
        User user = new User("Alice", 25, "secret123");
        String jsonString = toJson(user);
        System.out.println(jsonString);
    }
}
