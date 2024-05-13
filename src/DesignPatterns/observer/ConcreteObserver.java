package DesignPatterns.observer;

public class ConcreteObserver implements Observer{


    public ConcreteObserver(){}
    @Override
    public void update(ConcreteSubject subject) {
        System.out.println("Updated age is " + subject.getAge());
    }
}
