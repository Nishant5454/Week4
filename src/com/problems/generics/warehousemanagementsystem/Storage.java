package com.generics.warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    // list of each Product
    private List<T> list = new ArrayList<>();

    // getters and setters for items
    public void addItem(T item) {
        list.add(item);
    }
    public List<T> getItems() {
        return list;
    }

    // method to display items
    public static void displayItems(List<? extends WarehouseItem > items) {
        for (WarehouseItem item: items) {
            item.display();
        }
    }
}
