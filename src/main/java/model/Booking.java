package model;

import java.util.ArrayList;
import java.util.List;

public class Booking implements Searchable<Booking,String,Double>, Bookable {

    private String bookingID;
    private Customer customer;
    private Trip trip;
    private Flight flight;
    private Hotel hotel;
    private Ticket ticket;
    private double totalPrice;

    public Booking(String bookingID, Customer customer, Trip trip, Flight flight, Hotel hotel, double totalPrice) {
        this.bookingID = bookingID;
        this.customer = customer;
        this.trip = trip;
        this.flight = flight;
        this.hotel = hotel;
        this.totalPrice = totalPrice;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void confirmBooking(){
        System.out.println("The booking has been confirmed. Details are as follow:");
        System.out.println("Booking ID: " + this.bookingID);
        System.out.println("Customer: " + this.customer.getName());
        System.out.println("Trip: " + this.trip.getTripID());
        System.out.println("Flight: " + this.flight.getFlightID());
        System.out.println("Hotel: " + this.hotel.getHotelID());
        System.out.println("Total Price: " + this.totalPrice);
    }

    public void cancelBooking(){
        this.customer=null;
        this.flight=null;
        this.hotel=null;
        this.trip=null;
        this.totalPrice=0;
        System.out.println("The booking has been cancelled");
    }

    @Override
    public void book(Object bookingdetails) {
        if(!(bookingdetails instanceof Booking)){
            throw new IllegalArgumentException("Invalid Booking details");
        }
        Booking newBooking= (Booking) bookingdetails;
        this.customer=newBooking.customer;
        this.trip=newBooking.trip;
        this.flight=newBooking.flight;
        this.hotel=newBooking.hotel;
        this.totalPrice=newBooking.totalPrice;
        confirmBooking();
    }

    @Override
    public void cancel(Object bookingDetails) {
        if(!(bookingDetails instanceof Booking)){
            throw new IllegalArgumentException("Invalid Booking details");
        }
        Booking cancelBooking=(Booking)bookingDetails;
        if(this.bookingID.equals(cancelBooking.bookingID)){
            cancelBooking();
        }
    }

    @Override
    public double calculatePrice(Object bookingDetails) {
        if((bookingDetails instanceof Booking)){
            throw new IllegalArgumentException("Invalid Booking details");
        }
        Booking calculate=(Booking)bookingDetails;
        return calculate.getTotalPrice();
    }

    @Override
    public List<Booking> search(List<Booking> bookings, String bookingID) {
        List<Booking> result=new ArrayList<>();
        for(Booking booking: bookings){
            if(booking.getBookingID().equals(bookingID)){
                result.add(booking);
            }
        } return result;
    }
    @Override
    public List<Booking> filter(List<Booking> bookings, Double priceLimit) {
        List<Booking> result=new ArrayList<>();
        for(Booking booking : bookings){
            if(booking.getTotalPrice()<=priceLimit){
                result.add(booking);
            }
        } return result;
    }
    @Override
    public List sort(List<Booking> bookings) {
      for(int i=0; i<bookings.size()-1;i++){
          for(int j=0; j<bookings.size()-i-1;j++){
              if(bookings.get(j).getTotalPrice()>bookings.get(j+1).getTotalPrice()){
                  Booking temp = bookings.get(j);
                  bookings.set(j, bookings.get(j+1));
                  bookings.set(j+1, temp);
              }
          }
      } return bookings;
    }
}
