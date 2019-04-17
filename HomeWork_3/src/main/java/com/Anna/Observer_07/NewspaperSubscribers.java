package com.Anna.Observer_07;

public class NewspaperSubscribers implements Subscribers {

    public NewspaperSubscribers () {
    }

    @Override
    public void receivePublication() {
        System.out.println("I'm subscriber, I'm recieving the newspaper");
    }
}
