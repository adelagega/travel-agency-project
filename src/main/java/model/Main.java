package model;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //try to book the accomodation/ try to book the hotel
        /*try {
            Accomodation accomodation = new Hotel("PLAZA", "Tirane",
                    50.00, true, false, 3);

            if(accomodation.reserve()){
                System.out.println("Reservation was successfully made ");
            }
            System.out.println("Star rating is " + ((Hotel) accomodation).getStarRating());
        }


        catch (AccomodationNotAvailableException e) {
                System.out.println(e.getMessage());
        }
        catch (InvalidStarRatingException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bye");
    }
}
        //Customer customer=null;

       try {
           customer = new Customer("adela", "gega", 14, 500.00);
           System.out.println(customer);
       } catch(InvalidAgeException e){
           System.out.println(e.getMessage());
           return;
       }


        // make a payment
        try{
            double paymentAmount = 600;
            boolean isPaymentSuccessful = customer.makePayment(paymentAmount);
            if(isPaymentSuccessful) {
            System.out.println("Payment of " + paymentAmount +
                    " was successful.\nNew balance is: " + customer.getBalance());
                                 }
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());

        }

        refund a payment
        double refundAmount=50;
        boolean isRefundSuccessful =customer.refundPayment(refundAmount);
        if(isPaymentSuccessful){
            System.out.println("Refund of " + refundAmount + "was successfully made.\nNew Balance is: "+ customer.getBalance());
        }
        else{
            System.out.println("Refund of " + refundAmount + "wasnot successfully made.\nBalance is: "+ customer.getBalance());
        }
       */
     /*List<String> attractions=new ArrayList<String>();
     attractions.add("Central Park");
     attractions.add("Empire State Building");
     attractions.add("");
     attractions.add(null);

     try{
    Destination destination=new Destination("New York", attractions);
    } catch(AttractionNotFoundException e){
         System.out.println("Attraction not found");
     }
     */
     /*
   //
     Flight flight=new Flight("167","Wizzair","10:00Am","2PM",170.00,
             true,false,100);
     try{
         FileWriter writer = new FileWriter("flight.txt");
         writer.write(flight.toString());
         writer.close();
     } catch(IOException e){
         System.out.println("Error writing to file " + e.getMessage());
     }
     */

     // Log msg to console for destination class

}}






