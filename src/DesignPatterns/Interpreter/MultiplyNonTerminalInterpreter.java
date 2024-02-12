package DesignPatterns.Interpreter;

public class MultiplyNonTerminalInterpreter implements Interpreter{

    Interpreter left;
    Interpreter right;


    MultiplyNonTerminalInterpreter(Interpreter left, Interpreter right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
