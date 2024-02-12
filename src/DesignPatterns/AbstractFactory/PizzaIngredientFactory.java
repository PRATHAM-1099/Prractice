package DesignPatterns.AbstractFactory;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();
    public Pepperoni createPepperoni();

}
