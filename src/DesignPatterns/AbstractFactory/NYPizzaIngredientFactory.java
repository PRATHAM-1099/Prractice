package DesignPatterns.AbstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    @Override
    public Clams createClam() {
        return new FreshClams();
    }
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
