package model;

public enum FlightClass {
    Economy {
        @Override
        public String getDetails() {
            return "Economy class provides affordable prices with limitied amenities.";
        }
    },
    Business {
        @Override
        public String getDetails() {
            return "Business class offers more space and services, mid-level pricing.";
        }
    },
    First {
        @Override
        public String getDetails() {
            return "First class provides the highest level of service and luxury, highest pricing";
        }
    };

    public abstract String getDetails();
}
