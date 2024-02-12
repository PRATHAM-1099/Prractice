package DesignPatterns.observer;

public class Main {

    public static void main(String[] args) {
        Subject s = new ConcreteSubject();
        Observer c = new ConcreteObserver(s);

        s.setAge(50);
    }
}
