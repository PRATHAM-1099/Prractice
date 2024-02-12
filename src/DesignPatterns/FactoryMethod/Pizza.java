package DesignPatterns.FactoryMethod;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    public void prepare() {
        System.out.println("preparing " + name);
    }
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza in 4 pieces");
    }

    public void box() {
        System.out.println("Adding pizza to a box");
    }

    public String getName() {
        return name;
    }
}
