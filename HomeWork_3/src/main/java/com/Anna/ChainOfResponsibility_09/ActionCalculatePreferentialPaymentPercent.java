package com.Anna.ChainOfResponsibility_09;

public class ActionCalculatePreferentialPaymentPercent implements Action {

    private Action nextAction;

    @Override
    public void setNext(Action nextAction) {
        this.nextAction = nextAction;
    }

    @Override
    public void process(Payment payment) {
        System.out.println("No percent for preferential payments");
    }
}
