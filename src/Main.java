import DesignPatterns.State.GumballMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        MySingletonClass m = MySingletonClass.getMySingletonClass(50);
//        System.out.println(m.printAge());
//
//        NormalDuck n = new NormalDuck();
//        n.fly();
//        n.quack();
//
        //Observer Pattern
//        ConcreteSubject concreteSubjects = new ConcreteSubject();
//        ConcreteObserver o1 = new ConcreteObserver(concreteSubjects);
//        ConcreteObserver o2 = new ConcreteObserver(concreteSubjects);
//        concreteSubjects.setAge(10);

//        Beverage mocha = new Mocha(new Espresso());
//
//        System.out.println(mocha.cost());
//        System.out.println(mocha.getDescription());

//        NYPizzaStore nyPizzaStore = new NYPizzaStore();
//        Pizza pizza = nyPizzaStore.orderPizza("NYStyleCheesePizza");
//        System.out.println(pizza.getName());

//        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
//        nyStylePizzaStore.orderPizza("cheese");

//        Duck normalDuck = new NormalDuck();
//        Turkey normalTurkey = new NormalTurkey();
//        TurkeyAdapter turkeyDuck = new TurkeyAdapter(normalTurkey);
//        duckBehaviour(normalDuck);
//        duckBehaviour(turkeyDuck);

//        DinerMenu dinerMenu = new DinerMenu();
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
//        waitress.printMenu();

        GumballMachine gumballMachine = new GumballMachine(3);
        gumballMachine.insertQuarter();
        gumballMachine.releaseBall();

        System.out.println("Prathamesh");
        int[] dp = new int[5];

        List<Integer> arr = new ArrayList<>();


    }

//    private static void duckBehaviour(Duck duck) {
//        duck.fly();
//        duck.quack();
//    }

}