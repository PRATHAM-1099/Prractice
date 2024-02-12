package DesignPatterns.Interpreter;

public class NumberTerminalInterpreter implements Interpreter{

    String str;

    NumberTerminalInterpreter(String str){
        this.str = str;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(str);
    }
}
