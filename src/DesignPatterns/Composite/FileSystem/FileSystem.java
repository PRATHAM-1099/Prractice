package DesignPatterns.Composite.FileSystem;

public abstract class FileSystem {
    String name;
    void ls(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
