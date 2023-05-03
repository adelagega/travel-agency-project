package model;

import java.util.Date;

public abstract class Accomodation implements Bookable,Cancellable {

    private String name;
    private String location;
    private double price;
    private boolean isAvailable;
    private boolean isReserved;


    public Accomodation(String name, String location, double price, boolean isAvailable, boolean isReserved) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.isAvailable = isAvailable;
        this.isReserved = isReserved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }


    public boolean checkAvailability() {
        return isAvailable && !isReserved;
    }

    public boolean reserve() throws AccomodationNotAvailableException {
        if (checkAvailability()) {
            isReserved =true;
            return true;
        }
        else{
            throw new AccomodationNotAvailableException();
        }
    }

   /* public boolean reserve() {
        try
        {
            if(!checkAvailability()) {
                throw new AccomodationNotAvailableException();
            }
            isReserved = true;
            return true;
        } catch(AccomodationNotAvailableException e){
            System.out.println(e);
            return false;
        }
    }
    */

    public boolean cancelReservation() {
        if(isReserved){
            isReserved=false;
            return true;
        }else{
            return false;
        }
    }
    public abstract double getPricePerNight();

    @Override
    public String toString() {
        return "Accomodation{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", isReserved=" + isReserved +
                '}';
    }
}

