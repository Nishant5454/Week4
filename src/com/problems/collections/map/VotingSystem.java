package com.problems.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

// class to perform voting system
public class VotingSystem {
    private static HashMap<String, Integer> storeVotes = new HashMap<>();
    private static TreeMap<String, Integer> sortedOrder = new TreeMap<>();
    private static LinkedHashMap<String, Integer> maintainOrder = new LinkedHashMap<>();

    // method to add members
    public static void addMember(String member){
        storeVotes.put(member,storeVotes.getOrDefault(member, 0)+1);
        maintainOrder.put(member,maintainOrder.getOrDefault(member, 0)+1);
        sortedOrder = new TreeMap<>(storeVotes);
    }

    // method to display result
    public void display(){
        System.out.println("Votes stored in HashMap (default order): ");
        System.out.println(storeVotes + "\n");
        System.out.println("Sorted order of candidates (TreeMap): ");
        System.out.println(sortedOrder + "\n");
        System.out.println("Order in which votes were cast (LinkedHashMap): ");
        System.out.println(maintainOrder + "\n");
    }

    // method calling in main method
    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();

        vs.addMember("Saurabh");
        vs.addMember("Uday");
        vs.addMember("Uday");
        vs.addMember("Pankaj");

        vs.display();
    }
}
