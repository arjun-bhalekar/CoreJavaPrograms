package com.core.oop.abstraction;

public class PhonePay implements UpiPayment{

    @Override
    public void doTransaction() {
        System.out.println("transaction done by PhonePay app");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
