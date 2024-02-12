package DesignPatterns.Visitor;

public class Client {
    public static void main(String[] args) {
        RoomVisitor priceVisitor = new RoomPricingVisitor();
        RoomVisitor maintenanceVisitor = new RoomMaintenanceVisitor();

        RoomElement single = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxe = new DeluxeRoom();

        single.accept(priceVisitor);
        doubleRoom.accept(priceVisitor);
        deluxe.accept(priceVisitor);

        single.accept(maintenanceVisitor);
        doubleRoom.accept(maintenanceVisitor);
        deluxe.accept(maintenanceVisitor);
    }
}
