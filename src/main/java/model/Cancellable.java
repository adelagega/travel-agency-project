package model;

public interface Cancellable extends Bookable{
     int maxCancelDays = 7;
    boolean cancelReservation();

}
