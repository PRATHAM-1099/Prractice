package DesignPatterns.Iterator;

import java.util.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int count = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("pancake 1", "pancake 1 des", true, 2.99);
        addItem("pancake 2", "pancake 2 des", true, 2.99);
        addItem("pancake 3", "pancake 3 des", true, 2.99);
        addItem("pancake 4", "pancake 4 des", false, 2.98);
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    private void addItem(String name, String des, boolean isVeg, double price) {
        MenuItem menuItem = new MenuItem(name, des, isVeg, price);
        if(count>=MAX_ITEMS){
            System.out.println("Can't add more menu items");
        }
        else {
            menuItems[count] = menuItem;
            count = count + 1;
        }
    }
}
