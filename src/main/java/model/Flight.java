package model;

import java.util.List;

public class Flight implements Bookable, Searchable {
    private static int instanceCounter = 0;
    private String flightNumber;
    public String airline;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;
    private int availableSeats;
    private double pricePerSeat;
    private boolean isAvailable;

    public Flight(String airline, String departureAirport, String arrivalAirport, String departureTime, String arrivalTime, int availableSeats, double pricePerSeat, boolean isAvailable) {
        instanceCounter++;
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.pricePerSeat = pricePerSeat;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
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
    public void book(Object bookingdetails) {
        if(bookingdetails instanceof Integer){
            int numberOfSeats=(Integer) bookingdetails;
            if(isAvailable(numberOfSeats)){
                availableSeats-=numberOfSeats;
            } else{
                throw new IllegalStateException("No enough available seats");
            }
        } else {
         throw new IllegalArgumentException("Invalid Booking details");
        }
    }

    @Override
    public void cancel(Object bookingDetails) {
      if(bookingDetails instanceof Integer){
          int numberOfSeats=(Integer)bookingDetails;
          availableSeats+=numberOfSeats;
      }else{
          throw new IllegalArgumentException("Invalid Booking details");
      }
    }

    @Override
    public double calculatePrice(Object bookingDetails) {
        if(bookingDetails instanceof Double){
         int numberOfSeats=(Integer) bookingDetails;
         return pricePerSeat*numberOfSeats;
        } else{
            throw new IllegalArgumentException("Invalid Booking details");
        }
    }

    @Override
    public List<Object> search() {
        return null;
    }

    @Override
    public List<Object> filter() {
        return null;
    }

    @Override
    public List<Object> sort() {
        return null;
    }
}

