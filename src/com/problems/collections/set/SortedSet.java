package com.problems.collections.set;

import java.util.*;

public class SortedSet {
    // method to sort a set via tree set
    List<Integer> sortedSet(Set<Integer> set) {
        Set<Integer> ts = new TreeSet<>(set);
        return ts.stream().toList();
    }

    // method calling
    public static void main(String[] args) {
        SortedSet ss = new SortedSet();
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println(ss.sortedSet(set));
    }
}
