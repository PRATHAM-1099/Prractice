package DesignPatterns.ChainOfResponsibility.ATMMachine;

public interface DispenseChain {
    public void setNext(DispenseChain next);
    public void handle(Currency currency);
}
