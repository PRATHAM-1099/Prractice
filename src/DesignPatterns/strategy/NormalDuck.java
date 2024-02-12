package DesignPatterns.strategy;

public class NormalDuck extends Duck{
    public NormalDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }
}
