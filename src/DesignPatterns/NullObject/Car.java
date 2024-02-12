package DesignPatterns.NullObject;

public class Car implements Vehicle{

    @Override
    public void driveVehicle() {
        System.out.println("Driving Car");
    }

    @Override
    public void addTyres() {
        System.out.println("Adding 4 tyres");
    }
}
