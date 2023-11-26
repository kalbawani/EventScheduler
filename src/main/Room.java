package main;

import java.util.Objects;

public class Room {
    private String number;
    private Location location;
    private int capacity;

    public Room(String number, Location location, int capacity) {
        this.number = number;
        this.location = location;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public Location getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("%s (capacity: %d, location: %s)", number, capacity, location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return capacity == room.capacity && Objects.equals(number, room.number) && Objects.equals(location, room.location);
    }
}
