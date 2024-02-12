package DesignPatterns.strategy;

public class NormalQuackBehaviour implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("quackkk");
    }
}
