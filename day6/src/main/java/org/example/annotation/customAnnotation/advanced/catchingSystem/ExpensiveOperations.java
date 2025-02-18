package org.example.annotation.customAnnotation.advanced.catchingSystem;

// Class with computationally expensive method
public class ExpensiveOperations {

    @CacheResult
    public long computeFactorial(int number) {
        System.out.println("Computing factorial of " + number);
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
