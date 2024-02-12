package DesignPatterns.Interpreter;

import java.util.HashMap;

public class Context {
    HashMap<String, Integer> map = new HashMap<>();

    public void put(String key, int value){
        map.put(key,value);
    }

    public int getValue(String key){
        return map.get(key);
    }

}
