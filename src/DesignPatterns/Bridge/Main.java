package DesignPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Shape rectangle = new Rectangle(red);
        rectangle.applyColor();

        Color green = new GreenColor();
        Shape triangle = new Triangle(green);
        triangle.applyColor();
    }
}
