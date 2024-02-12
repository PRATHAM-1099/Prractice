package DesignPatterns.Iterator;

public class MenuItem {
    String name;
    String description;
    boolean isVeg;
    double price;

    public MenuItem(String name, String description, boolean isVeg, double price) {
        this.name = name;
        this.description = description;
        this.isVeg = isVeg;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
