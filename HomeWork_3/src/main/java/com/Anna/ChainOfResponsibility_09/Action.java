package com.Anna.ChainOfResponsibility_09;

public interface Action {

    public abstract void setNext(Action nextAction);

    public abstract void process(Payment payment);
}
