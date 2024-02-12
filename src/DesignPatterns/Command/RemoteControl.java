package DesignPatterns.Command;

public class RemoteControl {

    Command[] commands = new Command[2];
    Command undoCommand;

    public void pressButton(int ind){
        commands[ind].execute();
        undoCommand = commands[ind];
    }

    void setCommand(int ind, Command command){
        this.commands[ind] = command;
    }

    public void pressUndo(){
        undoCommand.undo();
    }
}
