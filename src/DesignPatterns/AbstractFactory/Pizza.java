package DesignPatterns.AbstractFactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();
    void bake() {

    }
    void cut() {

    }
    void box() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
