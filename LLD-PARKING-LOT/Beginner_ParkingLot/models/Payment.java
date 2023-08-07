package Beginner_ParkingLot.models;

import Beginner_ParkingLot.models.enums.PaymentMode;
import Beginner_ParkingLot.models.enums.PaymentStatus;

public class Payment extends BaseModel{
    private int amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private PaymentStatus paymentStatus;
//    private String transaction;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
