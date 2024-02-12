package DesignPatterns.Command;

public class RemoteLoader {

    public static void main(String[] args) {

        AC ac = new AC();
        ACOnCommand acOnCommand = new ACOnCommand(ac);
        ACOffCommand acOffCommand = new ACOffCommand(ac);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,acOnCommand);
        remoteControl.setCommand(1,acOffCommand);

        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressUndo();


    }
}
