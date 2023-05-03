package model;

public class Flight implements Bookable, Cancellable {

    private String flightNumber;
    private String airline;
    private String departureTime;
    private String arrivalTime;
    private double price;
    private boolean isAvailable;
    private boolean isReserved;
    private static final int maxCapacity; //
    private int seatsSold;

    static{
        maxCapacity = 300;
    }

    public Flight(String flightNumber, String airline, String departureTime, String arrivalTime, double price, boolean isAvailable, boolean isReserved, int seatsSold) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.isAvailable = isAvailable;
        this.isReserved = isReserved;
        this.seatsSold = seatsSold;
    }

    public static int getMaxCapacity() {
        return maxCapacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getSeatsSold() {
        return seatsSold;
    }

    public void setSeatsSold(int seatsSold) {
        this.seatsSold = seatsSold;
    }




    public boolean checkAvailability() {
        return isAvailable && !isReserved && (seatsSold<maxCapacity);
    }
    public boolean reserve() {
        if(checkAvailability()){
            isReserved=true;
            seatsSold++;
            return true;
        }else{
            return false;
        }
    }
    public boolean cancelReservation() {
        if(isReserved){
            isReserved=false;
            seatsSold--;
            return true;
        }else{
            return false;
        }
    }

    public static final void printMaxCapacity() {
        System.out.println("The maximum capacity of a Flight is " + maxCapacity + " seats.");
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airline='" + airline + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", isReserved=" + isReserved +
                ", seatsSold=" + seatsSold +
                '}';
    }
}
