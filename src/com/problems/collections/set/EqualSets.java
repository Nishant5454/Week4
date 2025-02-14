package com.problems.collections.set;

import java.util.HashSet;
import java.util.Set;

public class EqualSets {
    // method to check if elements are equal.
    boolean equalsets(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }

    // method calling
    public static void main(String[] args) {
        // objects
        EqualSets es = new EqualSets();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int n = 3;

        for (int i = 0; i < n; i++) {
            set1.add(i+1);
            set2.add(3-i);
        }

        System.out.println(es.equalsets(set1, set2));
    }
}
