package JUnit.testing.calculator.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListManager {
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
        System.out.println("The element that has been pushed is " + element);
    }

    public static void removeElement(List<Integer> list, int element) {
        if (list.contains(element)) {
            list.remove(Integer.valueOf(element)); // Remove by value
            System.out.println("The element that has been removed is " + element);
        } else {
            System.out.println("Element " + element + " not found in the list.");
        }
    }

    public static int sizeofList(List<Integer> list) {
        return list.size();
    }
}

public class TestingList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the element to push:");
        int number = sc.nextInt();
        ListManager.addElement(list, number);

        System.out.println("Enter the element to remove:");
        int removeNumber = sc.nextInt();
        ListManager.removeElement(list, removeNumber);

        int size = ListManager.sizeofList(list);
        System.out.println("Current size of the list: " + size);

        sc.close(); // Close the scanner
    }
}
