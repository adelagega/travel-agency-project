package service;

import model.Flight;
import model.Searchable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService implements Searchable<Flight,String,Double> {
    List<Flight>flights;

    public FlightService(List<Flight> flights) {
       this.flights=new ArrayList<>(flights);
    }

    @Override
    public List<Flight> search(String airline) {
        if(airline==null){
            throw new IllegalArgumentException();
        }
        return this.flights.stream()
                .filter(flight -> flight.getAirline().equals(airline))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> filter(Double maxPricePerSeat) {
        if(maxPricePerSeat==null){
            throw new IllegalArgumentException();
        }
        return this.flights.stream()
                .filter(flight -> flight.getPricePerSeat()<maxPricePerSeat)
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> sort() {
        return this.flights.stream()
                .sorted(Comparator.comparing(Flight::getDepartureTime))
                .collect(Collectors.toList());
    }


}
