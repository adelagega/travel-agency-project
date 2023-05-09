package model;

import java.util.ArrayList;

public class Destination {
    private String destinationID;
    private String name;
    private String country;
    private ArrayList<Attraction> attractions;

    public Destination(String destinationID, String name, String country, String description, ArrayList<Attraction> attractions) {
        this.destinationID = destinationID;
        this.name = name;
        this.country = country;
        this.attractions=new ArrayList<>();
    }

    public String getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(String destinationID) {
        this.destinationID = destinationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public void updateDestination(String destinationID, String name, String country){
        this.destinationID=destinationID;
        this.name=name;
        this.country=country;
    }

    public void addAttractions(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void removeAttraction(Attraction attraction){
        this.attractions.remove(attractions);
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destinationID='" + destinationID + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", attractions=" + attractions +
                '}';
    }
}
