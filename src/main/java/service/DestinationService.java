package service;

import model.Attraction;
import model.Destination;
import model.Searchable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DestinationService implements Searchable<Attraction,String,Double> {

    private List<Destination> destinations;

    public DestinationService(List<Destination> destinations) {
        this.destinations = new ArrayList<>(destinations);
    }

    public List<Attraction> search(String address) {
        if (address == null) {
            throw new IllegalArgumentException("Address must not be null.");
        }
        return destinations.stream()
                .flatMap(destination -> destination.getAttractions().stream())
                .filter(attraction -> attraction.getAddress().equals(address))
                .collect(Collectors.toList());
    }

    public List<Attraction> filter(Double maxEntryFee) {
        if (maxEntryFee == null) {
            throw new IllegalArgumentException("Maximum entry fee must not be null.");
        }
        return destinations.stream()
                .flatMap(destination -> destination.getAttractions().stream())
                .filter(attraction -> attraction.getEntryFee() <= maxEntryFee)
                .collect(Collectors.toList());
    }

    public List<Attraction> sort() {
        return  destinations.stream()
                .flatMap(destination -> destination.getAttractions().stream())
                .sorted(Comparator.comparingDouble(Attraction::getEntryFee))
                .collect(Collectors.toList());
    }

    public<T,S> List<S> mapWithFunction(List<T>list, Function<T,S> function) {
        if(list == null){
            return new ArrayList<>();
        }
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    public<T> void printWithConsumer(List<T>list, Consumer<T> consumer) {
        if (list != null) {
            list.forEach(consumer);
        }
    }
}
