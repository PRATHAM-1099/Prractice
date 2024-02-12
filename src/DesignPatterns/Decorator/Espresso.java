package DesignPatterns.Decorator;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }
    @Override
    public double cost() {
        return 350.00;
    }
}
