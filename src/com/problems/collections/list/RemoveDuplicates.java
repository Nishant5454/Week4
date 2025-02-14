package com.problems.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    // method for remove duplicate elements in list
    List<Integer> removeDuplicate(List<Integer> list) {
        List<Integer> ans = new ArrayList<>();
        for (int num: list) {
            if (!ans.contains(num)) {
                ans.add(num);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // method calling
        RemoveDuplicates rd = new RemoveDuplicates();
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));

        System.out.println(rd.removeDuplicate(list));
    }
}
