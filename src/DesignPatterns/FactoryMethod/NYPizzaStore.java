package DesignPatterns.FactoryMethod;

import java.util.Objects;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if(pizzaType.equals(PizzaType.NyStyleCheesePizza)){
            return new NYStyleCheesePizza();
        }
        else return null;
    }
}
