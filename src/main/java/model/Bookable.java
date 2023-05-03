package model;

public interface Bookable {
    boolean checkAvailability();
    boolean reserve() throws AccomodationNotAvailableException;
}
