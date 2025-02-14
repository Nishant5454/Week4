package com.problems.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubset {
    // method to find subset of set.
    boolean findSubset(Set<Integer> set1, Set<Integer> set2) {
        int count = 0;
        for (int num: set1) {
            if (set2.contains(num)) {
                count++;
            }
        }

        return count == set1.size();
    }

    // method calling
    public static void main(String[] args) {
        FindSubset fs = new FindSubset();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(fs.findSubset(set1, set2));
    }
}
