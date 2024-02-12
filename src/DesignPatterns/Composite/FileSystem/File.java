package DesignPatterns.Composite.FileSystem;

public class File extends FileSystem {

    File(String name){
        setName(name);
    }

    void ls(){
        System.out.println(getName());
    }
}
