package DesignPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore pz = new NYPizzaStore();
        Pizza pizza = pz.orderPizza(PizzaType.NyStyleCheesePizza);
    }
}
