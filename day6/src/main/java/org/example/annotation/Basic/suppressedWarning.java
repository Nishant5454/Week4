package org.example.annotation.Basic;

import java.util.ArrayList;

public class suppressedWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList arr=new ArrayList<>();
        arr.add("Nishant");
        arr.add(0);
        System.out.println(arr);

    }
}
