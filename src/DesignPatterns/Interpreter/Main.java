package DesignPatterns.Interpreter;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 5);
        context.put("b", 5);

        Interpreter multiply = new MultiplyNonTerminalInterpreter(new NumberTerminalInterpreter("a"), new NumberTerminalInterpreter("b"));
        System.out.println(multiply.interpret(context));
    }

}
