package model;

public interface Bookable<T> {

    void book(T bookingdetails);
    void cancel(T bookingDetails);
    double calculatePrice(T bookingDetails);
}
