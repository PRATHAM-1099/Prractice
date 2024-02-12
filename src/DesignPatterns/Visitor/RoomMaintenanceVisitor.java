package DesignPatterns.Visitor;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom element) {
        System.out.println("Maintenance for single room");
    }

    @Override
    public void visit(DoubleRoom element) {
        System.out.println("Maintenance for double room");
    }

    @Override
    public void visit(DeluxeRoom element) {
        System.out.println("Maintenance for deluxe room");
    }
}
