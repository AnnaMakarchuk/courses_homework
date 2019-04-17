package com.Anna.ChainOfResponsibility_09;

public class Payment {

    private final String accountNumber;
    private final String accountHolderName;
    private final String accountHolderSurname;
    private final String toAccount;
    private final double paymentAmount;
    private final PaymentType paymentType;

    public Payment (String accountNumber, String accountHolderName, String accountHolderSurname, String toAccount,
                    double paymentAmount, PaymentType paymentType){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountHolderSurname = accountHolderSurname;
        this.toAccount = toAccount;
        this.paymentAmount = paymentAmount;
        this.paymentType = paymentType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderSurname() {
        return accountHolderSurname;
    }

    public String getToAccount() {
        return toAccount;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment = (Payment) o;

        if (Double.compare(payment.paymentAmount, paymentAmount) != 0) return false;
        if (accountNumber != null ? !accountNumber.equals(payment.accountNumber) : payment.accountNumber != null)
            return false;
        if (accountHolderName != null ? !accountHolderName.equals(payment.accountHolderName) :
                payment.accountHolderName != null)
            return false;
        if (accountHolderSurname != null ? !accountHolderSurname.equals(payment.accountHolderSurname) :
                payment.accountHolderSurname != null)
            return false;
        if (toAccount != null ? !toAccount.equals(payment.toAccount) : payment.toAccount != null) return false;
        return paymentType == payment.paymentType;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = accountNumber != null ? accountNumber.hashCode() : 0;
        result = 31 * result + (accountHolderName != null ? accountHolderName.hashCode() : 0);
        result = 31 * result + (accountHolderSurname != null ? accountHolderSurname.hashCode() : 0);
        result = 31 * result + (toAccount != null ? toAccount.hashCode() : 0);
        temp = Double.doubleToLongBits(paymentAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountHolderSurname='" + accountHolderSurname + '\'' +
                ", toAccount='" + toAccount + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", paymentType=" + paymentType +
                '}';
    }
}
