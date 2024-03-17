package com.core.oop.abstraction;

public interface UpiPayment {


    public void doTransaction();

    //java 8 feature - default method
    public default void setPIN() {
        System.out.println("default implementation for setPIN");
    }

    //java 8 feature - static method
    public static void genReportForLast10Transactions(){
        System.out.println("Generating last 10 transaction report");
    }

}
