package DesignPatterns.Decorator;

public class Main {

    public static void main(String[] args) {
        Beverage mocha = new Mocha(new Espresso());
        System.out.println(mocha.getDescription());
    }
}
