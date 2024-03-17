package com.core.oop.inheritance;

import com.core.oop.encapsulation.Item;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface InventoryService {

    public Item addItem(Item item) throws IOException;
    public void addItem(List<Item> items); //method overloading
    public void removeItem(Item item);
    public void removeItem(int itemId); //method overloading

    public Item searchItem(int itemId);
    public Item searchItem(String itemName); //method overloading

}
