package model;

import java.util.ArrayList;

public class Ticket {

     private final String ticketID;
     private Flight flight;
     private Customer customer;
     private String seatNumber;
     private double price;
     private BookingClass bookingClass;
     private ArrayList<Ticket> tickets;

    public Ticket(String ticketID, Flight flight, Customer customer, String seatNumber, double price, BookingClass bookingClass, ArrayList<Ticket> tickets) {
        this.ticketID = ticketID;
        this.flight = flight;
        this.customer = customer;
        this.seatNumber = seatNumber;
        this.price = price;
        this.bookingClass = bookingClass;
        this.tickets = new ArrayList<>();
    }

    public String getTicketID() {
        return ticketID;
    }

    public Flight getFlight() {
        return flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookingClass(BookingClass bookingClass) {
        this.bookingClass = bookingClass;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket){
        this.tickets.remove(ticket);
    }

    public Ticket findTicketById(String ticketID){
        for(Ticket ticket : tickets){
            if(ticket.getTicketID().equals(ticketID)){
                return ticket;
            }
        } return null;
    }

    public void printTicket() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Flight: " + flight.getFlightNumber());
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Class: " + bookingClass);
    }
}