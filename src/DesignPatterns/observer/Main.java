package DesignPatterns.observer;

public class Main {

    public static void main(String[] args) {
        Subject s = new ConcreteSubject();
        s.registerObserver(new ConcreteObserver());


        s.setAge(50);
    }
}
