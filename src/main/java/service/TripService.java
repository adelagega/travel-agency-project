package service;

import model.Searchable;
import model.Trip;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class TripService implements Searchable<Trip,String,Double> {

    private List<Trip> trips;

    public TripService(List<Trip> trips) {
       this.trips=new ArrayList<>(trips);
    }

    public List<Trip> search(String tripID) {
        return this.trips.stream()
                .filter(booking->booking.getTripID().equals(tripID))
                .collect(Collectors.toList());
    }

    public List<Trip> filter(Double priceLimit) {
        return this.trips.stream()
                .filter(trip -> trip.getTotalPrice()<= priceLimit)
                .collect(Collectors.toList());
    }

    public List<Trip> sort() {
        return  this.trips.stream()
                .sorted(Comparator.comparingDouble(Trip::getTotalPrice))
                .collect(Collectors.toList());
    }

    public<T> List<T> filterWithPredicate(List<T> list, Predicate<T> predicate) {
        return  list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public void addTrip(Trip trip){
          this.trips.add(trip);
    }

    public void removeBooking(String tripID){
          this.trips = this.trips.stream()
                 .filter(booking -> !booking.getTripID().equals(tripID))
                 .collect(Collectors.toList());
    }
}
