package model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Flight implements Bookable<Integer> {
    private final String flightID;
    public String airline;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int availableSeats;
    private double pricePerSeat;


    public Flight(String airline, String departureAirport, String arrivalAirport, LocalDateTime departureTime, LocalDateTime arrivalTime, int availableSeats, double pricePerSeat) {
        this.flightID=UUID.randomUUID().toString();
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.pricePerSeat = pricePerSeat;
    }

    public String getFlightID() {
        return flightID;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(double pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public boolean isAvailable(int numberOfSeats){
        return availableSeats>=numberOfSeats;
    }


    @Override
    public void book(Integer numOfSeats) {
        if(isAvailable(numOfSeats)){
            availableSeats-=numOfSeats;
        } else {
            throw new IllegalStateException("Not enough evailable seats");
        }
    }
    @Override
    public void cancel(Integer numOfSeats) {
       availableSeats+=numOfSeats;
    }
    @Override
    public double calculatePrice(Integer numOfSeats) {
        return pricePerSeat*numOfSeats;
    }
    @Override
    public String toString() {
        return "Flight{" +
                "flightID='" + flightID + '\'' +
                ", airline='" + airline + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", availableSeats=" + availableSeats +
                ", pricePerSeat=" + pricePerSeat +
                '}';
    }
}

