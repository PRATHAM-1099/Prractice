package DesignPatterns.Decorator;

public abstract class Beverage {
    private String description = "This is default description";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
