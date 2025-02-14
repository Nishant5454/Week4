package com.problems.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    // method to find symmetric difference
    Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> s = new HashSet<>();
        for (int num: set1) {
            if (!set2.contains(num)) {
                s.add(num);
            }
        }
        for (int num: set2) {
            if (!set1.contains(num)) {
                s.add(num);
            }
        }
        return s;
    }

    //method calling
    public static void main(String[] args) {
        SymmetricDifference obj = new SymmetricDifference();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println(obj.findSymmetricDifference(set1, set2));
    }
}
