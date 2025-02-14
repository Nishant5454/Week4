package com.problems.collections.list;

import java.util.*;

public class FindNthElement {
    // method to find element from lst nth in singly linked list
    char findElement(List<Character> list, int n) {
        ListIterator<Character> i = list.listIterator();
        ListIterator<Character> j = list.listIterator();
        int count = 0;

        while (count < n && i.hasNext()) {
            i.next();
            count++;
        }

        while (i.hasNext()) {
            i.next();
            j.next();
        }

        return j.next();
    }

    // method calling
    public static void main(String[] args) {
        FindNthElement fe = new FindNthElement();
        List<Character> list = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        int n = 2;

        System.out.println(fe.findElement(list, n));
    }
}
