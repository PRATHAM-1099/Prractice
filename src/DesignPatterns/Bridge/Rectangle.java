package DesignPatterns.Bridge;

public class Rectangle extends Shape {

    Rectangle(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color to rectangle");
        color.applyColor();
    }
}
