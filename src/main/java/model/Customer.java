package model;

import java.util.ArrayList;
import java.util.List;

public class Customer  {

   private String customerID;
   private String name;
   private String email;
   private String contactNumber;
   private List<Booking> bookings;

   public Customer(String customerID, String name, String email, String contactNumber, List<Booking> bookings) {
      this.customerID = customerID;
      this.name = name;
      this.email = email;
      this.contactNumber = contactNumber;
      this.bookings=new ArrayList<>();
   }

   public String getCustomerID() {
      return customerID;
   }

   public void setCustomerID(String customerID) {
      this.customerID = customerID;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getContactNumber() {
      return contactNumber;
   }

   public void setContactNumber(String contactNumber) {
      this.contactNumber = contactNumber;
   }

   public List<Booking> getBookings() {
      return bookings;
   }

   public void setBookings(List<Booking> bookings) {
      this.bookings = bookings;
   }

   public void updateCustomerInformation(String customerID, String name, String email, String contactNumber){
      this.customerID=customerID;
      this.name=name;
      this.email=email;
      this.contactNumber=contactNumber;
   }

   public List<Booking> getBookingHistory(){
      return this.bookings;
   }

   public void addBooking(Booking booking){
     this.bookings.add(booking);
   }

   public void cancelBooking(Booking booking){
      this.bookings.remove(booking);
   }

   @Override
   public String toString() {
      return "Customer{" +
              "customerID='" + customerID + '\'' +
              ", name='" + name + '\'' +
              ", email='" + email + '\'' +
              ", contactNumber='" + contactNumber + '\'' +
              ", bookings=" + bookings +
              '}';
   }
}
