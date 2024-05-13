package LLD.VehicleRentalSystem.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {

    List<Vehicle> vehicleList;

    public VehicleInventory(){
        vehicleList = new ArrayList<>();
    }

    public void addVehicles(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
}
