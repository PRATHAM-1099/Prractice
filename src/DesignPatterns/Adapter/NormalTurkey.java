package DesignPatterns.Adapter;

public class NormalTurkey extends Turkey{
    @Override
    public void fly() {
        System.out.println("turkey fly");
    }

    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }
}
