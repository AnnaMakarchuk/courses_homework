package com.Anna.State_08;

public class DraftState extends State {

    public DraftState(Grant grant) {
        super(grant);
    }

    @Override
    public void receiveFeedback() {
        System.out.println("Commisition is waiting for grant");
    }

    @Override
    public void publishing() {
        receiveFeedback();
        System.out.println("Grant is created and sent to the commission");
        grant.changeState(new ReviewState(grant));
    }
}
