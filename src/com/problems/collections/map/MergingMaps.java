package com.problems.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MergingMaps {
    // method to merge two maps
    public static HashMap<Character, Integer> mergeTwoMaps(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){

        for(Map.Entry<Character,Integer> itr : map2.entrySet()){
            int val = itr.getValue();
            char key = itr.getKey();

            if (map1.containsKey(key)){
                map1.put(key, val + map1.get(key));
            } else{
                map1.put(key,val);
            }
        }

        return map1;
    }

    public static void main(String[] args) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        map1.put('A', 1);
        map1.put('B', 2);

        map2.put('B',3);
        map2.put('C', 4);

        System.out.println(mergeTwoMaps(map1, map2));
    }
}
