package org.example.annotation.customAnnotation.advanced.catchingSystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Cache Manager to store and retrieve cached results
class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    // Method to invoke and cache results
    public static Object invokeWithCache(Object obj, String methodName, Object... args) throws Exception {
        Method method = obj.getClass().getMethod(methodName, getParameterTypes(args));

        // Check if the method has @CacheResult annotation
        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = methodName + "_" + getArgsKey(args);

            // Check if result is already cached
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + methodName);
                return cache.get(key);
            }

            // Invoke method and store result in cache
            Object result = method.invoke(obj, args);
            cache.put(key, result);
            return result;
        }

        // If method is not annotated, just invoke normally
        return method.invoke(obj, args);
    }

    // Helper method to get argument types for reflection
    private static Class<?>[] getParameterTypes(Object[] args) {
        return java.util.Arrays.stream(args)
                .map(Object::getClass)
                .toArray(Class<?>[]::new);
    }

    // Helper method to generate a unique key based on method arguments
    private static String getArgsKey(Object[] args) {
        return java.util.Arrays.deepToString(args);
    }
}
