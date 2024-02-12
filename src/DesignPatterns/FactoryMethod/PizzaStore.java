package DesignPatterns.FactoryMethod;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza;
        pizza  = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType pizzaType);

}
