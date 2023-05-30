package model;

public class Attraction {
    private String attractionID;
    private String name;
    private String address;
    private String type;
    private double entryFee;
    private String openingHours;

    public Attraction(String attractionID, String name, String address, String type, double entryFee, String openingHours) {
        this.attractionID = attractionID;
        this.name = name;
        this.address = address;
        this.type = type;
        this.entryFee = entryFee;
        this.openingHours = openingHours;
    }

    public String getAttractionID() {
        return attractionID;
    }

    public void setAttractionID(String attractionID) {
        this.attractionID = attractionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public void displayAttractionInfo() {
        System.out.println("Attraction Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Type: " + type);
        System.out.println("Entry Fee: $" + entryFee);
        System.out.println("Opening Hours: " + openingHours);
    }
}

