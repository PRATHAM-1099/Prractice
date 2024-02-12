package DesignPatterns.Decorator;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setDescription(beverage.getDescription() + ", Mocha");
    }


    @Override
    public double cost() {
        return 20.00 + beverage.cost();
    }


}
