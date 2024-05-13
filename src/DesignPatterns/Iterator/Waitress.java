package DesignPatterns.Iterator;

import java.util.Iterator;

public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("Menu Dinner");
        printMenu(dinerIterator);

        System.out.println("Menu Breakfast");
        printMenu(pancakeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.name);
            System.out.println(menuItem.description);
            System.out.println(menuItem.price);
        }
    }

}
