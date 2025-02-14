package com.generics.warehousemanagementsystem;

public class SmartWarehouse {
    public static void main(String[] args) {
        // Creating storage for different types of items
        Storage<Electronic> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to storages
        electronicsStorage.addItem(new Electronic("Laptop", 49999));
        electronicsStorage.addItem(new Electronic("Smartphone", 19999));

        groceriesStorage.addItem(new Groceries("Apples", 80));
        groceriesStorage.addItem(new Groceries("Milk", 50));

        furnitureStorage.addItem(new Furniture("Table", 500));
        furnitureStorage.addItem(new Furniture("Chair", 400));

        // Display all items using the wildcard method
        System.out.println("Displaying Electronics:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\nDisplaying Groceries:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\nDisplaying Furniture:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
