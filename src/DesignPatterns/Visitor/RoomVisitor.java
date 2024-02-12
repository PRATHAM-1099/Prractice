package DesignPatterns.Visitor;

public interface RoomVisitor {
    public void visit(SingleRoom element);
    public void visit(DoubleRoom element);
    public void visit(DeluxeRoom element);
}
