package DesignPatterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> mementoList = new ArrayList<>();

    public void takeSnapshot(Memento memento){
        mementoList.add(memento);
    }

    public Memento undo(){
        int n = mementoList.size();
        if(n>0){
            Memento memento = mementoList.get(n-1);
            mementoList.remove(n-1);
            return memento;
        }
        else return null;
    }
}
