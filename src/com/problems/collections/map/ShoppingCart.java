package com.problems.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// class to handle Shopping cart items
public class ShoppingCart {
    private final HashMap<String, Double> productPrices = new HashMap<>();
    private final LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
    private final TreeMap<Double, String> sortedCart = new TreeMap<>();

    // method to add product
    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }

    // method to add into cart
    public void addToCart(String name, int quantity) {
        if (productPrices.containsKey(name)) {
            cart.put(name, cart.getOrDefault(name, 0) + quantity);
            sortedCart.put(productPrices.get(name), name);
        } else {
            System.out.println("Product not found!");
        }
    }

    // method to print cart
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue() + ", Price: " + productPrices.get(entry.getKey()));
        }
    }

    // method to print sorted cart
    public void displaySortedCart() {
        System.out.println("Cart sorted by price:");
        for (Map.Entry<Double, String> entry : sortedCart.entrySet()) {
            System.out.println(entry.getValue() + " - Price: " + entry.getKey());
        }
    }

    // performing operations
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("COla",56);
        cart.addProduct("DAl",82);
        cart.addProduct("Chips",36);

        cart.addToCart("COla",1);
        cart.addToCart("DAl",2);
        cart.addToCart("Chips",3);

        cart.displayCart();
        cart.displaySortedCart();
    }
}
