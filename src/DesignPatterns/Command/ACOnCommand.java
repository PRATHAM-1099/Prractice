package DesignPatterns.Command;

public class ACOnCommand implements Command{

    AC ac;

    ACOnCommand(AC ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
