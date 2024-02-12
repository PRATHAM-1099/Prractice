package DesignPatterns.Visitor;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
