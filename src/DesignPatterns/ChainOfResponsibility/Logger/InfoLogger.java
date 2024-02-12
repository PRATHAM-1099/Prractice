package DesignPatterns.ChainOfResponsibility.Logger;

public class InfoLogger extends Logger{

    public void log(Level level, String msg){
        if(level==Level.INFO){
            System.out.println("Info Logger");
        }
        else{
            super.log(level,msg);
        }
    }

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }
}
