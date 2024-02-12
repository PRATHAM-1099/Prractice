package DesignPatterns.Visitor;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom element) {
        System.out.println("Price for single room");
    }

    @Override
    public void visit(DoubleRoom element) {
        System.out.println("Price for double room");
    }

    @Override
    public void visit(DeluxeRoom element) {
        System.out.println("Price for deluxe room");
    }
}
