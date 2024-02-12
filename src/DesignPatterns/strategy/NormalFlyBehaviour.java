package DesignPatterns.strategy;

public class NormalFlyBehaviour implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("flyyyy");
    }
}
