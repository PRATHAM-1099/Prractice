package DesignPatterns.Command;

public class ACOffCommand implements Command{

    AC ac;

    ACOffCommand(AC ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
