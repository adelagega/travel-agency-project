package model;

import java.util.List;

public class Hotel {
    private String hotelID;
    private String name;
    private String address;
    private int rating;
    private RoomType roomType;
    private double pricePerRoom;

    public Hotel(String hotelID, String name, String address, int rating, RoomType roomType, double pricePerRoom) {
        this.hotelID = hotelID;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.roomType = roomType;
        this.pricePerRoom = pricePerRoom;
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

    public double getPricePerRoom() {
        return pricePerRoom;
    }

    public void setPricePerRoom(double pricePerRoom) {
        this.pricePerRoom = pricePerRoom;
    }
}