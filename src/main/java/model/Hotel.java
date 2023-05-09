package model;

import java.util.List;

public class Hotel implements Bookable, Searchable{

     private String hotelID;
     private String name;
     private String address;
     private int rating;
     private RoomType roomType;

     public Hotel(String hotelID, String name, String address, int rating, RoomType roomType) {
         this.hotelID = hotelID;
         this.name = name;
         this.address = address;
         this.rating = rating;
         this.roomType = roomType;
     }

     public String getHotelID() {
         return hotelID;
     }

     public void setHotelID(String hotelID) {
         this.hotelID = hotelID;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public int getRating() {
         return rating;
     }

     public void setRating(int rating) {
         this.rating = rating;
     }

     public RoomType getRoomType() {
         return roomType;
     }

     public void setRoomType(RoomType roomType) {
         this.roomType = roomType;
     }

    @Override
    public void book(Object bookingdetails) {

    }

    @Override
    public void cancel(Object bookingDetails) {

    }

    @Override
    public double calculatePrice(Object bookingDetails) {
        return 0;
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