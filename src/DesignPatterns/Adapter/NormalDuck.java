package DesignPatterns.Adapter;

public class NormalDuck extends Duck{
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
