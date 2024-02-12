package DesignPatterns.ChainOfResponsibility.Logger;

public class ErrorLogger extends Logger{

    public void log(Level level, String msg){
        if(level==Level.ERROR){
            System.out.println("Error Logger" + msg);
        }
        else{
            super.log(level,msg);
        }
    }

    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }
}
