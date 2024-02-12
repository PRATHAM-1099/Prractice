package DesignPatterns.Adapter;

public class Main {

    public static void main(String[] args) {
        Turkey turkey = new NormalTurkey();
//        Duck duck = new NormalDuck();

        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();

    }
}
