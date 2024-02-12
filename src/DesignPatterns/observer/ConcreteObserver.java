package DesignPatterns.observer;

public class ConcreteObserver implements Observer{

    Subject subject;
    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(ConcreteSubject subject) {
        System.out.println("Updated age is " + subject.getAge());
    }
}
