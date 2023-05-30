package model;

public enum RoomType {
    SINGLE("Single room",4),
    DOUBLE("Double room",3),
    TWIN("Twin",1),
    SUITE("Suite",2);

    private final String description;
    private final int capacity;

    RoomType(String description, int capacity) {
        this.description = description;
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "description='" + description + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
