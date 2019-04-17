package com.Anna.State_08;

public abstract class State {

    protected Grant grant;

    public State (Grant grant) {
        this.grant = grant;
    }

    public Grant getGrant() {
        return grant;
    }

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    public abstract void receiveFeedback();
    public abstract void publishing();
}
