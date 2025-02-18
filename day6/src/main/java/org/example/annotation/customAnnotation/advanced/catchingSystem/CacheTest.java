package org.example.annotation.customAnnotation.advanced.catchingSystem;

public class CacheTest {
    public static void main(String[] args) throws Exception {
        ExpensiveOperations operations = new ExpensiveOperations();

        // First call - should compute and cache
        System.out.println("Factorial: " + CacheManager.invokeWithCache(operations, "computeFactorial", 5));

        // Second call - should return cached result
        System.out.println("Factorial: " + CacheManager.invokeWithCache(operations, "computeFactorial", 5));

        // Another call with a different argument - should compute again
        System.out.println("Factorial: " + CacheManager.invokeWithCache(operations, "computeFactorial", 6));
    }
}
