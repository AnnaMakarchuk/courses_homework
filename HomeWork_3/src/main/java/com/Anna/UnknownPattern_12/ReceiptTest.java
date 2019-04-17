package com.Anna.UnknownPattern_12;

public class ReceiptTest {
    public static void main(String[] args) {
        ReceiptService service = new ReceiptService();
        System.out.println("Please extend date for expired reciepts");
        System.out.println("new receipt will be " + service.dateExtension("24/04/2019"));


    }
}
