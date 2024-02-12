package DesignPatterns.singleton;

import java.util.*;

public class MySingletonClass {

    private static volatile MySingletonClass unique = null;
    private int age = 10;

    private MySingletonClass(int age) {
        this.age = age;
    }

    public int printAge() {
        return this.age;
    }

    private static class innerClass {
            private static final MySingletonClass INSTANCE =  new MySingletonClass(10);
    }

    public static MySingletonClass getMySingletonClass(int age) {
//        if(unique==null){
//            synchronized (MySingletonClass.class) {
//                if(unique==null){
//                    unique = new MySingletonClass(age);
//                }
//            }
//        }
//
//        return unique;

        return innerClass.INSTANCE;
    }

}
