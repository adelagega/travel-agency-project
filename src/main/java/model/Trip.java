package model;

import java.util.UUID;

public class Trip {
    private final String tripID;
    private Customer customer;
    private Flight flight;
    private Hotel hotel;
    private Attraction attraction;
    private double totalPrice;

    public Trip(Customer customer, Flight flight, Hotel hotel, Attraction attraction, double totalPrice) {
        this.tripID = UUID.randomUUID().toString();
        this.customer = customer;
        this.flight = flight;
        this.hotel = hotel;
        this.attraction=attraction;
        this.totalPrice = totalPrice;
    }

    public String getTripID() {
        return tripID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripID='" + tripID + '\'' +
                ", customer=" + customer +
                ", flight=" + flight +
                ", hotel=" + hotel +
                ", attraction=" + attraction +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
