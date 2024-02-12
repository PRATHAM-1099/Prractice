package DesignPatterns.TemplateMethod;

public abstract class CaffeineBeverage {

    //This is a Template Method, serves as template for an algorithm
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(hook()) {
            addCondiments();
        }
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    abstract void brew();

    abstract void addCondiments();

    //Subclasses are free to override this method but not necessarily
    boolean hook() {
        return true;
    }
}
