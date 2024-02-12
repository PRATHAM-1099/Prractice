package DesignPatterns.Iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int pos = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return pos < items.length && items[pos] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[pos];
        pos = pos + 1;
        return menuItem;
    }
}
