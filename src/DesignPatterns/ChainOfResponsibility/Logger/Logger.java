package DesignPatterns.ChainOfResponsibility.Logger;



public class Logger {

    Logger nextLogger;

    Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }


    public void log(Level level, String msg){
        if(nextLogger != null){
            nextLogger.log(level,msg);
        }
    }



}
