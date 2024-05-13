package LLD.VehicleRentalSystem.Vehicle;

public abstract class Vehicle {

    public Vehicle(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
    int regId;
    int vehicleNo;
    VehicleType vehicleType;

}
