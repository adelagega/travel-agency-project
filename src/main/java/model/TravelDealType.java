package model;

public enum TravelDealType {
    FAMILY("Family Trip & Vacation"),
    COUPLE("Couple's getaway and honeymoon trips"),
    SOLO("Solo adventure"),
    ADVENTURE("Group adventure"),
    BUSINESS("Business trip");

    private final String description;

    TravelDealType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TripType{" +
                "description='" + description + '\'' +
                '}';
    }
}
