package DesignPatterns.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    private ArrayList<Observer> observers;
    private int age;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int ind = observers.indexOf(o);
        if(ind>=0){
            observers.remove(ind);
        }
    }

    public void notifyObservers() {
        for(int i=0;i<observers.size();i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(this);
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
        notifyObservers();
    }
}
