package com.core.oop.inheritance;

import com.core.oop.encapsulation.Item;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class InventoryServiceImpl implements InventoryService {


    @Override
    public Item addItem(Item item) throws FileNotFoundException {
        return null;
    }

    @Override
    public void addItem(List<Item> items) {

    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public void removeItem(int itemId) {

    }

    @Override
    public Item searchItem(int itemId) {
        return null;
    }

    @Override
    public Item searchItem(String itemName) {
        return null;
    }
}
