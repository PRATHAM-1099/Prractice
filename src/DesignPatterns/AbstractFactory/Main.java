package DesignPatterns.AbstractFactory;


public class Main {

    public static void main(String[] args) {
        PizzaStore pz = new NYStylePizzaStore();
        pz.orderPizza("cheese");
    }
}
