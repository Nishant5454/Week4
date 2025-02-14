package com.problems.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnionAndIntersection {
    // method to find union
    Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }

    // method to find intersection
    Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>();
        for (int num: set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }

    //method calling
    public static void main(String[] args) {
        FindUnionAndIntersection fui = new FindUnionAndIntersection();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Union: " + fui.findUnion(set1, set2));
        System.out.println("Intersection: " + fui.findIntersection(set1, set2));
    }
}
