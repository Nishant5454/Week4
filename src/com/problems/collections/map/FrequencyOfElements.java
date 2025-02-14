package com.problems.collections.map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    // method to find frequency in map via string array
    Map<String, Integer> findFrequency(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }
        return map;
    }

    // method calling
    public static void main(String[] args) {
        FrequencyOfElements fe = new FrequencyOfElements();
        System.out.println(fe.findFrequency(new String[] {"apple", "banana", "apple", "orange"}));
    }
}
