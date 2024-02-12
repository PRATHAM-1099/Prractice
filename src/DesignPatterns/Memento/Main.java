package DesignPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        CareTaker ct = new CareTaker();

        Originator o = new Originator(10,12);
        System.out.println(o);

        ct.takeSnapshot(o.createMemento());

        o.setHeight(15);
        o.setWidth(17);
        System.out.println(o);

        ct.takeSnapshot(o.createMemento());

        o.setHeight(20);
        o.setWidth(22);
        System.out.println(o);

        Memento memento = ct.undo();
        o.restoreMemento(memento);
        System.out.println(o);
    }
}
