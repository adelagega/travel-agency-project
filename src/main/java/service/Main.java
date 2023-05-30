package service;

import model.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Flight> flights=new ArrayList<>();
        flights.add(new Flight("Lufthansa", "TIA", "JFK",
                LocalDateTime.of(2023, 6, 1, 12, 0),
                LocalDateTime.of(2023, 6, 1, 16, 0),
                100, 300.0));

        flights.add(new Flight("American Airline", "ATL", "IAD",
                LocalDateTime.of(2023, 6, 2, 10, 0),
                LocalDateTime.of(2023, 6, 2, 14, 0),
                200, 250.0));

        flights.add(new Flight("Delta Air Line", "JFK", "ORD",
                LocalDateTime.of(2023, 6, 3, 14, 0),
                LocalDateTime.of(2023, 6, 3, 18, 0),
                150, 350.0));

        FlightService flightService=new FlightService(flights);

        Runnable search=()->{
            synchronized (flightService) {
                List<Flight> foundFlights = flightService.search("American Airline");
                if (foundFlights.isEmpty()) {
                    System.out.println("No flights found for the airline: American Airline");
                } else {
                    System.out.println("Flights found for the airline: American Airline");
                    foundFlights.forEach(System.out::println);
                }
            }
        };

        Thread searchThread1 = new Thread(search);
        Thread searchThread2 = new Thread(search);

        searchThread1.start();
        searchThread2.start();

    }
}
