package DesignPatterns.TemplateMethod;

public class Main {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
