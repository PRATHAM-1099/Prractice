package DesignPatterns.ChainOfResponsibility.ATMMachine;

public class Dollar20Dispenser implements DispenseChain{
    DispenseChain dispenseChain;
    @Override
    public void setNext(DispenseChain next) {
        this.dispenseChain = next;
    }

    @Override
    public void handle(Currency currency) {
        if(currency.getAmount()%50==0){
            System.out.println("Dispensing " + currency.getAmount()/20 + " Notes of 20");
        }
        else {
            System.out.println("Dispensing " + currency.getAmount()/20 + " Notes of 20");
            dispenseChain.handle(new Currency(currency.getAmount()%20));
        }
    }
}
