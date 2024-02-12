package DesignPatterns.NullObject;

public class Main {

    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory();
        Vehicle v = vf.getVehicle("car");
        v.addTyres();
        v.driveVehicle();
    }

}
