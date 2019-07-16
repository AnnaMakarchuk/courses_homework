package com.Anna.State_08;

import java.util.Scanner;

public class PublishingState extends State {

    public PublishingState(Grant grant) {
        super(grant);
        publishing();
    }

    @Override
    public void receiveFeedback() {
        System.out.println("Your grant is");
    }

    @Override
    public void publishing() {
        System.out.println("please input decision :positive, edit or negative ");
        Scanner in = new Scanner(System.in);
        String decision = in.nextLine();
        receiveFeedback();
        switch (decision) {
            case ("positive"):
                System.out.print("accepted");
                break;
            case ("edit"):
                System.out.println("on edit");
                grant.changeState(new DraftState(grant));
                grant.publishing();
                break;
            case ("negative"):
                System.out.print("cancelled, try again later");
                break;
        }
    }
}
