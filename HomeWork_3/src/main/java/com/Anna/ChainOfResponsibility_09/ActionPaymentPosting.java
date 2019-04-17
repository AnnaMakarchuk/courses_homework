package com.Anna.ChainOfResponsibility_09;

public class ActionPaymentPosting implements Action {

    private Action nextAction;
    private Payment payment;

    @Override
    public void setNext(Action nextAction) {
        this.nextAction = nextAction;
    }

    @Override
    public void process(Payment payment) {
        double amount = payment.getPaymentAmount();
        // Payment amount should be less than 10000.00
        if (amount <= 2000.00) {
            System.out.println("Amount is correct");
        } else throw new IllegalArgumentException("Payment amount too much");
    }
}
