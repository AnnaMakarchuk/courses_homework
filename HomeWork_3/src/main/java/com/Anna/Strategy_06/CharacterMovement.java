package com.Anna.Strategy_06;

public class CharacterMovement {

    private Strategy strategy;

    public CharacterMovement() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void move (CharacterType type) {
        switch (type) {
            case MAGE:
                setStrategy(new StrategyFlight());
                strategy.move();
                setStrategy(new StrategyWalk());
                strategy.move();
                break;
            case FLYING:
                setStrategy(new StrategyFlight());
                strategy.move();
                break;
            case WARRIOR:
                setStrategy(new StrategyWalk());
                strategy.move();
                break;
            case PALLADIN:
                setStrategy(new StrategyWalk());
                strategy.move();
                break;
        }
    }

//    public void move(CharacterType type){
//        set(type).move();
//    }
}
