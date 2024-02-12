package DesignPatterns.Composite.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie Directory");
        File gadar = new File("   -Gadar Movie");
        File jawan = new File("   -Jawan Movie");
        movieDirectory.addItem(gadar);
        movieDirectory.addItem(jawan);
        Directory comedy = new Directory("Comedy Movies");
        File welcome = new File("   -Welcome Movie");
        comedy.addItem(welcome);
        movieDirectory.addItem(comedy);
        movieDirectory.ls();
    }
}
