package DesignPatterns.Composite.FileSystem;

import java.util.ArrayList;

public class Directory extends FileSystem{
    ArrayList<FileSystem> directoryList;

    Directory(String name){
        setName(name);
        directoryList = new ArrayList<>();
    }

    public void addItem(FileSystem fl){
        directoryList.add(fl);
    }

    void ls(){
        System.out.println(getName());

        for(FileSystem fl: directoryList){
            fl.ls();
        }
    }

}
