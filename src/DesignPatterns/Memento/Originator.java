package DesignPatterns.Memento;

public class Originator {
    int height;
    int width;

    public Originator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public Memento createMemento(){
        return new Memento(height,width);
    }

    public void restoreMemento(Memento memento){
        this.height = memento.height;
        this.width  = memento.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
