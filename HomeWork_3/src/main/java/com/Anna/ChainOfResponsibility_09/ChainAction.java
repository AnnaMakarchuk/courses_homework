package com.Anna.ChainOfResponsibility_09;

import java.util.regex.Pattern;

public class ChainAction {

    public void buildAction(Payment payment) {
        switch (payment.getPaymentType()) {
            case USUAL:
                buildActionUsualPayments(payment);
                break;
            case STATE:
                buildActionStatePayments(payment);
                break;
            case PREFERENTIAL:
                buildActionPreferencialPayments(payment);
                break;
        }
    }

    public void buildActionUsualPayments(Payment payment) {
        Action actionAccept = new ActionPaymentAcceptance();
        Action actionPost = new ActionPaymentPosting();
        Action actionPercent = new ActionCalculateUsualPaymentPercent();
        Action actionFinal = new FinalAction();

        actionAccept.process(payment);
        actionAccept.setNext(actionPost);
        actionPost.process(payment);
        actionPost.setNext(actionPercent);
        actionPercent.process(payment);
        actionPercent.setNext(actionFinal);
        actionFinal.process(payment);
    }

    public void buildActionStatePayments(Payment payment) {
        Action actionPost = new ActionPaymentPosting();
        Action actionAccept = new ActionPaymentAcceptance();
        Action actionPercent = new ActionCalculateStatePaymentPercent();
        Action actionFinal = new FinalAction();

        actionAccept.process(payment);
        actionAccept.setNext(actionPost);
        actionPost.process(payment);
        actionPost.setNext(actionPercent);
        actionPercent.process(payment);
        actionPercent.setNext(actionFinal);
        actionFinal.process(payment);
    }

    public void buildActionPreferencialPayments(Payment payment) {
        Action actionPost = new ActionPaymentPosting();
        Action actionAccept = new ActionPaymentAcceptance();
        Action actionPercent = new ActionCalculatePreferentialPaymentPercent();
        Action actionFinal = new FinalAction();

        actionAccept.process(payment);
        actionAccept.setNext(actionPost);
        actionPost.process(payment);
        actionPost.setNext(actionPercent);
        actionPercent.process(payment);
        actionPercent.setNext(actionFinal);
        actionFinal.process(payment);
    }


}
