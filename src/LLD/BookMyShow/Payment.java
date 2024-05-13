package LLD.BookMyShow;

import LLD.BookMyShow.Enum.PaymentStatus;
import LLD.BookMyShow.Enum.PaymentType;

public class Payment {
    PaymentStatus paymentStatus;
    PaymentType paymentType;
    int amount;

    void makePayment(int amount){
        this.amount = amount;
        this.paymentStatus = PaymentStatus.DONE;
    }
}
