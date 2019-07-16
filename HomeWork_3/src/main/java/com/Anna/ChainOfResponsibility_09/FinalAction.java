package com.Anna.ChainOfResponsibility_09;

public class FinalAction implements Action {
    @Override
    public void setNext(Action nextAction) {
    }

    @Override
    public void process(Payment payment) {
        System.out.println("Payment is made");
    }
}
