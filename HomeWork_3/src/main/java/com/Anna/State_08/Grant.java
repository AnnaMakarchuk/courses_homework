package com.Anna.State_08;

public class Grant {

    private State state;

    public Grant () {
        this.state = new DraftState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState (State state) {
         this.state = state;
    }

    public void receiveFeedback() {
        state.receiveFeedback();
    }

    public void publishing() {
        this.state.publishing();
    }
}
