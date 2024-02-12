package DesignPatterns.strategy;

public abstract class Duck {
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void quack() {
        quackBehaviour.quack();
    }

}
