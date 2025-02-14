package com.problems.collections.list;

import java.util.LinkedList;
import java.util.List;

public class ElementsRotation {
    // method for reversing list in k steps
    List<Integer> rotateList(List<Integer> list, int k) {
        for (int i = 0; i < k; i++) {
            list.add(list.remove(0));
        }
        return list;
    }

    // method calling
    public static void main(String[] args) {
        ElementsRotation er = new ElementsRotation();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add((i+1) * 10);
        }

        System.out.println(er.rotateList(list, 2));
    }
}
