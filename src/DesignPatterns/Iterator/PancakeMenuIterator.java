package DesignPatterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    int i = 0;
    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() != i;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(i);
        i = i + 1;
        return menuItem;
    }
}
