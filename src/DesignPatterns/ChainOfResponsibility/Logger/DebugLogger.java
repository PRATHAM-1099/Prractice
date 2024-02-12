package DesignPatterns.ChainOfResponsibility.Logger;

public class DebugLogger extends Logger{

    public void log(Level level, String msg){
        if(level==Level.DEBUG){
            System.out.println("Debug Logger");
        }
        else{
            super.log(level,msg);
        }
    }

    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }
}
