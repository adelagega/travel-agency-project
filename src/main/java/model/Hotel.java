package model;

public class Hotel extends Accomodation {

    private int starRating;

    public Hotel(String name, String location, double price, boolean isAvailable, boolean isReserved, int starRating) {
        super(name, location, price, isAvailable, isReserved);
        this.starRating = starRating;
    }

  /*public Hotel(String name, String location, double price, boolean isAvailable, boolean isReserved, int starRating) {
        super(name, location, price, isAvailable, isReserved);
        try{
            if(starRating<0||starRating>5){
                throw new InvalidStarRatingException();
            }
            this.starRating=starRating;
        } catch(InvalidStarRatingException e){
            System.out.println(e.getMessage());
            this.starRating=-1;
        }
    }
     */

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    @Override
    public double getPricePerNight() {
        return 0;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + getName() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", price=" + getPrice() +
                ", isAvailable=" + isAvailable() +
                ", isReserved=" + isReserved() +
                ", starRating=" + starRating +
                '}';
    }
}