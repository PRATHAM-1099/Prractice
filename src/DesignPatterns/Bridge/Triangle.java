package DesignPatterns.Bridge;

public class Triangle extends Shape {

    Triangle(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color to triangle");
        color.applyColor();
    }
}
