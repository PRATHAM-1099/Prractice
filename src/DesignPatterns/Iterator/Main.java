package DesignPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
