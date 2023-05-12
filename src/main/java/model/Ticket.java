package model;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Ticket {
     private final String ticketID;
     private Customer customer;
     private Flight flight;
     private LocalDateTime dateOfDeparture;
     private LocalDateTime dateOfArrival;
     private String timeOfDeparture;
     private String timeOfArrival;
     private String gateNumber;
     private String seatNumber;

     public Ticket(Customer customer, Flight flight, LocalDateTime dateOfDeparture, LocalDateTime dateOfArrival, String timeOfDeparture, String timeOfArrival, String gateNumber, String seatNumber) {
          this.ticketID=UUID.randomUUID().toString();
          this.customer = customer;
          this.flight = flight;
          this.dateOfDeparture = dateOfDeparture;
          this.dateOfArrival = dateOfArrival;
          this.timeOfDeparture = timeOfDeparture;
          this.timeOfArrival = timeOfArrival;
          this.gateNumber = gateNumber;
          this.seatNumber = seatNumber;
     }

     public String getTicketID() {
          return ticketID;
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

     public LocalDateTime getDateOfDeparture() {
          return dateOfDeparture;
     }

     public void setDateOfDeparture(LocalDateTime dateOfDeparture) {
          this.dateOfDeparture = dateOfDeparture;
     }

     public LocalDateTime getDateOfArrival() {
          return dateOfArrival;
     }

     public void setDateOfArrival(LocalDateTime dateOfArrival) {
          this.dateOfArrival = dateOfArrival;
     }

     public String getTimeOfDeparture() {
          return timeOfDeparture;
     }

     public void setTimeOfDeparture(String timeOfDeparture) {
          this.timeOfDeparture = timeOfDeparture;
     }

     public String getTimeOfArrival() {
          return timeOfArrival;
     }

     public void setTimeOfArrival(String timeOfArrival) {
          this.timeOfArrival = timeOfArrival;
     }

     public String getGateNumber() {
          return gateNumber;
     }

     public void setGateNumber(String gateNumber) {
          this.gateNumber = gateNumber;
     }

     public String getSeatNumber() {
          return seatNumber;
     }

     public void setSeatNumber(String seatNumber) {
          this.seatNumber = seatNumber;
     }

     public void printTicket() {
          System.out.println("Ticket ID: " + this.ticketID);
          System.out.println("Flight: " + this.flight.getFlightID());
          System.out.println("Customer: " + this.customer.getName());
          System.out.println("Date of Departure" + this.dateOfDeparture);
          System.out.println("Date of Arrival" + this.dateOfArrival);
          System.out.println("Time of Departure" + this.timeOfDeparture);
          System.out.println("Time of Arrival" + this.timeOfArrival);
          System.out.println("Gate Number" + this.gateNumber);
          System.out.println("SeatNumber" + this.seatNumber);
     }
}