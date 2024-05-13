package LLD.VehicleRentalSystem;

import LLD.VehicleRentalSystem.Vehicle.VehicleInventory;

import java.util.List;

public class Store {

    int storeId;
    VehicleInventory vehicleInventory;
    Location location;
    List<User> userList;
    List<Booking> bookingList;

    public Store(int storeId, VehicleInventory vehicleInventory, Location location){
        this.storeId = storeId;
        this.vehicleInventory = vehicleInventory;
        this.location = location;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void addBooking(Booking booking){
        bookingList.add(booking);
    }


}
