package com.core.oop.abstraction;

public class GPay implements UpiPayment {

    @Override
    public void doTransaction() {
        System.out.println("transaction done by GPay app");
    }

    @Override
    public void setPIN() {
        System.out.println("GPay implementation for setPIN");
    }
}
