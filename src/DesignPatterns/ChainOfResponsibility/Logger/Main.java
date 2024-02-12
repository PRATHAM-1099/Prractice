package DesignPatterns.ChainOfResponsibility.Logger;

import DesignPatterns.ChainOfResponsibility.Logger.*;

public class Main {

    public static void main(String[] args){

        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.log(Level.ERROR, " unsupported exception");;

    }
}
