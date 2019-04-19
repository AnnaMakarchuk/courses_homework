package com.Anna.Observer_07;

import java.util.List;

public class PostOffice {
    private List<Subscribers> subscribersList;

    public PostOffice() {
        this.subscribersList = SubsribersList.createSubribers();
    }

    public void sendSuscriber() {
        for (Subscribers subscriber : subscribersList) {
            if (subscriber instanceof NewspaperSubscribers) {
                subscriber.receivePublication();
            } else if (subscriber instanceof JournalSubsribers) {
                subscriber.receivePublication();
            } else throw new IllegalArgumentException();
        }
    }
}
