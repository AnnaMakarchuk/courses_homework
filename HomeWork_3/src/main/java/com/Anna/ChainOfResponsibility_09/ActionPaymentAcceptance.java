package com.Anna.ChainOfResponsibility_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActionPaymentAcceptance implements Action {

    private static final String REGEX_ACCOUNT_NUMBER = "[\\d]{5}";
    private static final String REGEX_ACCOUNT_HOLDER_DETAILS = "[A-Z]{1}[a-z]+";
    private Action nextAction;

    @Override
    public void setNext(Action nextAction) {
        this.nextAction = nextAction;
    }

    @Override
    public void process(Payment payment) {
        String accountNumber = payment.getAccountNumber();
        String toAccountNumber = payment.getToAccount();
        String accountHolderName = payment.getAccountHolderName();
        String accountHolderSurname = payment.getAccountHolderSurname();

        // Accounts numbers should be only digit and length 5.
        // Account holder name and surname should be only letters
        if (!ActionPaymentAcceptance.checkData(REGEX_ACCOUNT_NUMBER, accountNumber)) {
            throw new IllegalArgumentException("inccorect accountNumber");
        } else if (!ActionPaymentAcceptance.checkData(REGEX_ACCOUNT_NUMBER, toAccountNumber)) {
            throw new IllegalArgumentException("inccorect toAccountNumber");
        } else if (!ActionPaymentAcceptance.checkData(REGEX_ACCOUNT_HOLDER_DETAILS, accountHolderName)) {
            throw new IllegalArgumentException("inccorect Name");
        } else if (!ActionPaymentAcceptance.checkData(REGEX_ACCOUNT_HOLDER_DETAILS, accountHolderSurname)) {
            throw new IllegalArgumentException("inccorect Surname");
        } else {
            System.out.println("Payment accept and in procces");
        }
    }

    public static boolean checkData(String regex, String checkString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(checkString);
        return matcher.matches();
    }
}
