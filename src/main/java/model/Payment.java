package model;

import java.util.UUID;

public class Payment {
    private final String paymentID;
    private Flight flight;
    private Trip trip;

    private TravelDeal travelDeal;
    private double amount;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;


    public Payment(Flight flight, Trip trip, TravelDeal travelDeal, double amount, PaymentMethod paymentMethod, PaymentStatus paymentStatus) {
        this.paymentID= UUID.randomUUID().toString();
        this.flight = flight;
        this.trip=trip;
        this.travelDeal = travelDeal;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public TravelDeal getTravelPackage() {
        return travelDeal;
    }

    public void setTravelPackage(TravelDeal travelDeal) {
        this.travelDeal = travelDeal;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void changePaymentStatus(PaymentStatus newStatus){
        switch(newStatus){
            case PENDING:
                System.out.println("Payment is pending. Please wait for confirmation.");
                break;
            case SUCCESS:
                System.out.println("Payment is successful.");
                break;
            case FAILED:
                System.out.println("Payment has failed. Please try again");
                break;
            case REFUNDED:
                System.out.println("Payment has been refunded.");
                break;
            default:
                throw new IllegalArgumentException("Invalid payment status" + newStatus);
        }
        this.paymentStatus=newStatus;
    }
}
