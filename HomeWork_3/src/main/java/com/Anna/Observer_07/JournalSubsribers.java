package com.Anna.Observer_07;

public class JournalSubsribers implements Subscribers {

    public JournalSubsribers() {
    }

    @Override
    public void receivePublication() {
        System.out.println("I'm subscriber, I'm recieving the journal");
    }
}
