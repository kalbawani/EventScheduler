package main;

import java.util.Objects;

public class Location {
    private String street;
    private int building;
    private int floor;

    public Location(String street, int building, int floor) {
        this.street = street;
        this.building = building;
        this.floor = floor;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return String.format("%s %d, floor %d",
                getStreet(), getBuilding(), getFloor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return building == location.building && floor == location.floor && Objects.equals(street, location.street);
    }
}
