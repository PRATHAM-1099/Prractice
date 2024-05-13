package LLD.VehicleRentalSystem;

public class Bill {
    int billId;
    Booking booking;
    Payment payment;

    public int getBillAmount(){
        return booking.rate*10;
    }
}
