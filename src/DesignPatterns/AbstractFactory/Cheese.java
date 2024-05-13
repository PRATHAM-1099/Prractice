package DesignPatterns.AbstractFactory;

public interface Cheese {

     default int add(){
        return 5+5;
    }
}
