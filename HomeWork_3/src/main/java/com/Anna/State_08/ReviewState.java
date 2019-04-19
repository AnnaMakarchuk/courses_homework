package com.Anna.State_08;

public class ReviewState extends State {

    public ReviewState(Grant grant) {
        super(grant);
        publishing();
    }

    @Override
    public void receiveFeedback() {
        System.out.println("Waiting commision desicion");
    }

    @Override
    public void publishing() {
        receiveFeedback();
        System.out.println(("Commision is making desicion"));
        grant.changeState(new PublishingState(grant));
    }
}
