package DesignPatterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();

        addItem("pancake 1", "pancake 1 des", true, 2.99);
        addItem("pancake 2", "pancake 2 des", true, 2.99);
        addItem("pancake 2", "pancake 3 des", true, 2.97);
        addItem("pancake 2", "pancake 4 des", false, 2.99);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }


    private void addItem(String name, String des, boolean isVeg, double price) {
        MenuItem menuItem = new MenuItem(name, des, isVeg, price);
        menuItems.add(menuItem);
    }
}
