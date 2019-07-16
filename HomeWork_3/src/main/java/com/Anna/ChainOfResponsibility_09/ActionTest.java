package com.Anna.ChainOfResponsibility_09;

import java.util.ArrayList;
import java.util.List;

public class ActionTest {

    private static List<Payment> paymentList;

    public static void main(String[] args) {
        paymentList = createPayments();
        ChainAction chainAction = new ChainAction();
        for (Payment payment : paymentList) {
            System.out.println(payment);
            chainAction.buildAction(payment);
            System.out.println("***");
        }
    }

    public static List<Payment> createPayments() {
        paymentList = new ArrayList<>();
        paymentList.add(new Payment("12525", "Anna",
                "Makarchuk", "25879", 500, PaymentType.USUAL));
        paymentList.add(new Payment("12525", "Anna",
                "Makarchuk", "57841", 200, PaymentType.STATE));
        paymentList.add(new Payment("12525", "Anna",
                "Makarchuk", "57841", 2000, PaymentType.PREFERENTIAL));
        return paymentList;
    }
}
