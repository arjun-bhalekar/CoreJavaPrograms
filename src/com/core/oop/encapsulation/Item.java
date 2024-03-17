package com.core.oop.encapsulation;

/**
 * This class is an example of Encapsulation. <br/>
 * All fields are private & to set/get those attributes Getter's & Setter's method are added.
 */
public class Item {

    private int id;
    private String name;
    private int quantity;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 100) {
            throw new RuntimeException("Quantity should not be more than 100");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
