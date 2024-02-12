package DesignPatterns.Mediator;

public class Bidder implements Colleague{

    String name;
    Mediator mediator;

    Bidder(Mediator mediator, String name){
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void placeBid(int amount) {
        mediator.placeBid(this,amount);
    }

    @Override
    public void receiveBidNotification(int amount) {
        System.out.println("Someone has placed bid for " + amount + "amount");
    }

    @Override
    public String getName() {
        return name;
    }
}
