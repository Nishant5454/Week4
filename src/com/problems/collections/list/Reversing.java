package com.problems.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Reversing {
    // Method to reverse arrayList
    ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++; j--;
        }

        return list;
    }

    // method to reverse linkedlist
    LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
        int i = 0, j = list.size();
        for (i = 0; i < j; i++) {
            list.add(i, list.remove(j-1));
        }
        return list;
    }

    // method calling
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        int n = 5;
        for (int i = 0; i < n; i++) {
            list.add(i+1);
            list2.add(i+1);
        }

        Reversing rl = new Reversing();
        System.out.println("Reversed ArrayList: " + rl.reverseArrayList(list));
        System.out.println("Reversed LinkedList: " + rl.reverseLinkedList(list2));
    }
}
