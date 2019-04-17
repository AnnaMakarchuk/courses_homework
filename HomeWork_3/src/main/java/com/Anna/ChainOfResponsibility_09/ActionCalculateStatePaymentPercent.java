package com.Anna.ChainOfResponsibility_09;

public class ActionCalculateStatePaymentPercent implements Action {

    private Action nextAction;

    @Override
    public void setNext(Action nextAction) {
        this.nextAction = nextAction;
    }

    @Override
    public void process(Payment payment) {
        System.out.println("The percentage 0.05% is calculated = " + payment.getPaymentAmount()*0.05/100);
    }
}

