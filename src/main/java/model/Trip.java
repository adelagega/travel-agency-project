package model;

import java.util.List;

public class Trip {
    private String tripID;
    private String startDate;
    private String endDate;
    private double price;
    private TripType tripType;
    private Destination destination;

    public Trip(String tripID, String startDate, String endDate, double price, TripType tripType, Destination destination) {
        this.tripID = tripID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.tripType = tripType;
        this.destination = destination;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

}
