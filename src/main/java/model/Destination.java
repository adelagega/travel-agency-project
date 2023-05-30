package model;

import java.util.ArrayList;

public class Destination {
    private String destinationID;
    private String name;
    private ArrayList<Attraction> attractions;

    public Destination(String destinationID, String name, ArrayList<Attraction> attractions) {
        this.destinationID = destinationID;
        this.name = name;
        if(attractions == null){
            this.attractions=new ArrayList<>();
        } else {
            this.attractions=new ArrayList<>(attractions);
        }
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

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void updateDestination(String destinationID, String name, String country){
        this.destinationID=destinationID;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destinationID='" + destinationID + '\'' +
                ", name='" + name + '\'' +
                ", attractions=" + attractions +
                '}';
    }
}
