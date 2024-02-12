package DesignPatterns.AbstractFactory;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
