package DesignPatterns.ChainOfResponsibility.ATMMachine;

public class Dollar10Dispenser implements DispenseChain{
    DispenseChain dispenseChain;
    @Override
    public void setNext(DispenseChain next) {
        this.dispenseChain = next;
    }

    @Override
    public void handle(Currency currency) {
        if(currency.getAmount()%10==0){
            System.out.println("Dispensing " + currency.getAmount()/10 + " Notes of 10");
        }
        else {
            System.out.println("Dispensing " + currency.getAmount()/10 + " Notes of 10");
            dispenseChain.handle(new Currency(currency.getAmount()%10));
        }
    }
}
