package model;

import java.util.List;

public class TravelPackage implements Bookable,Payment {

    private String name;
    private double price;
    private List<Destination> destination;
    private List<Accomodation> accomodation;
    private List<Flight> flight;

    public TravelPackage(String name, double price, List<Destination> destination, List<Accomodation> accomodation, List<Flight> flight) {
        this.name = name;
        this.price = price;
        this.destination = destination;
        this.accomodation = accomodation;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Destination> getDestination() {
        return destination;
    }

    public void setDestination(List<Destination> destination) {
        this.destination = destination;
    }

    public List<Accomodation> getAccomodation() {
        return accomodation;
    }

    public void setAccomodation(List<Accomodation> accomodation) {
        this.accomodation = accomodation;
    }

    public List<Flight> getFlight() {
        return flight;
    }

    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

    // interface methods implementation
    public boolean checkAvailability() {
        return false;
    }

    public boolean reserve(){
        return false;
    }

    public boolean cancelReservation() {
        return false;
    }

    public boolean makePayment(double amount) {
        return false;
    }

    public boolean refundPayment(double amount) {
        return false;
    }

    public double getBalance() {
        return 0;
    }
}
