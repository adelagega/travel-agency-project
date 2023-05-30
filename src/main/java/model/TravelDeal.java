package model;

public class TravelDeal {
    private String packageID;
    private Customer customer;
    private String startDate;
    private String endDate;
    private TravelDealType tripType;
    private Destination destination;
    private Hotel hotel;
    private Flight flight;
    private double price;

    public TravelDeal(String packageID, Customer customer, String startDate, String endDate, TravelDealType tripType, Destination destination, Hotel hotel, Flight flight, double price) {
        this.packageID = packageID;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tripType = tripType;
        this.destination = destination;
        this.hotel = hotel;
        this.flight = flight;
        this.price = price;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public TravelDealType getTripType() {
        return tripType;
    }

    public void setTripType(TravelDealType tripType) {
        this.tripType = tripType;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
