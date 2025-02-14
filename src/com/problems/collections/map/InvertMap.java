package com.problems.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    // method to invert a map
    static HashMap<Integer, List<Character>> invertMap(HashMap<Character, Integer> map){
        HashMap<Integer, List<Character>> result = new HashMap<>();
        int cap = map.size();
        int i = 1;
        for(Map.Entry<Character, Integer> it : map.entrySet()){
            char key = it.getKey();
            int val = it.getValue();
            result.computeIfAbsent(val,k-> new ArrayList<>()).add(key);
        }

        return result;
    }

    // method calling
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('A', 1);
        hm.put('B', 2);
        hm.put('C', 1);

        System.out.println(invertMap(hm));
    }
}
