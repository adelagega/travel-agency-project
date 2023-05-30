package service;

import model.Destination;
import model.TravelDeal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TravelDealService {
    private List<TravelDeal> travelDealList;

    public TravelDealService(List<TravelDeal> travelDealList) {
       this.travelDealList =new ArrayList<>(travelDealList);
    }

    public void addTravelPackage(TravelDeal travelDeal){
        travelDealList.add(travelDeal);
    }

    public void removeTravelPackage(String travelPackageID){
        travelDealList = travelDealList.stream()
                .filter(trip -> !trip.getPackageID().equals(travelPackageID))
                .collect(Collectors.toList());
    }

    public List<TravelDeal> searchByDestination(Destination destination) {
        return travelDealList.stream()
                .filter(travelDeal -> travelDeal.getDestination().equals(destination))
                .collect(Collectors.toList());
    }

    public List<TravelDeal> filterByprice(double priceLimit){
        return travelDealList.stream()
                .filter(trip -> trip.getPrice()<=priceLimit)
                .collect(Collectors.toList());
    }

    public List<TravelDeal> sortByPrice(){
        return travelDealList.stream()
                .sorted(Comparator.comparingDouble(TravelDeal::getPrice))
                .collect(Collectors.toList());
    }
}
