package com.Anna.Observer_07;

import java.util.ArrayList;
import java.util.List;

public class SubsribersList {
    public static List<Subscribers> createSubribers () {
        List<Subscribers> subscribersList = new ArrayList<>();
        subscribersList.add(new JournalSubsribers());
        subscribersList.add(new NewspaperSubscribers());
        subscribersList.add(new JournalSubsribers());
        subscribersList.add(new NewspaperSubscribers());
        subscribersList.add(new NewspaperSubscribers());
        subscribersList.add(new JournalSubsribers());
        subscribersList.add(new NewspaperSubscribers());
        subscribersList.add(new JournalSubsribers());
        subscribersList.add(new NewspaperSubscribers());
        subscribersList.add(new NewspaperSubscribers());
        return subscribersList;
    }


}
