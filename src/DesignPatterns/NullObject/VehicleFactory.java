package DesignPatterns.NullObject;

import java.util.Objects;

public class VehicleFactory {

    Vehicle getVehicle(String type){
        if(Objects.equals(type, "CAR")){
            return new Car();
        }
        else return new NullVehicle();
    }
}
