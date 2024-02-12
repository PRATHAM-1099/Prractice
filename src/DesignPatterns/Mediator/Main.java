package DesignPatterns.Mediator;

public class Main {

    public static void main(String[] args) {


        Mediator mediator = new AuctionMediator();
        Bidder bidder1 = new Bidder(mediator,"bidder 1");
        Bidder bidder2 = new Bidder(mediator, "bidder 2");
        Bidder bidder3 = new Bidder(mediator, "bidder 3");

        mediator.addBidder(bidder1);
        mediator.addBidder(bidder2);
        mediator.addBidder(bidder3);

        bidder1.placeBid(1000);
        bidder2.placeBid(1050);
    }
}
