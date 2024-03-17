package com.core.oop.abstraction;

public class UpiPaymentTest {

    public static void main(String[] args) {

        UpiPayment upiPaymentByGPay = new GPay();
        upiPaymentByGPay.setPIN();
        upiPaymentByGPay.doTransaction();

        UpiPayment upiPaymentByPPay = new PhonePay();
        upiPaymentByPPay.setPIN();
        upiPaymentByPPay.doTransaction();

        UpiPayment.genReportForLast10Transactions();

    }
}
