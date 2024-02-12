package DesignPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{

    List<Bidder> bidderList = new ArrayList<>();
    @Override
    public void addBidder(Bidder bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        for(Bidder bid: bidderList){
            if(!bidder.getName().equals(bid.getName())){
                sendNotification(bid,amount);
            }
        }
    }

    public void sendNotification(Bidder bidder, int amount){
        bidder.receiveBidNotification(amount);
    }
}
