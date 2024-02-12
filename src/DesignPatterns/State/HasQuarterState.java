package DesignPatterns.State;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have ejected a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned crank");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {

    }}
