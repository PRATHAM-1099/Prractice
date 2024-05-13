package LLD.ElevatorDesign;

public class ElevatorController {
    ElevatorCar elevatorCar;

    void acceptRequest(int from, int to){

    }
    void sendRequest(){
        elevatorCar.move(Direction.UP, 5);
    }
}
