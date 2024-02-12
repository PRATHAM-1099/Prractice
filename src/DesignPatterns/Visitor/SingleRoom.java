package DesignPatterns.Visitor;

public class SingleRoom implements RoomElement{

    int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
