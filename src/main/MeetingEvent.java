package main;

import java.util.*;

public class MeetingEvent extends RoomEvent {
    private Employee organizer;
    private ArrayList<Employee> guestList;

    public MeetingEvent(int id, String name, Date date, Time startTime, Time endTime, Room room, Employee organizer, ArrayList<Employee> guestList) {
        super(id, name, date, startTime, endTime, room);
        this.organizer = organizer;
        this.guestList = guestList;
    }

    public Employee getOrganizer() {
        return organizer;
    }

    public ArrayList<Employee> getGuestList() {
        return guestList;
    }

    @Override
    public String toString() {
        String guests = "";

        for (Employee guest : guestList) {
            guests += guest + "  ";
        }

        return super.toString() +
                String.format(
                        "%n    Organizer: %s" +
                                "%n    Guests: %s"
                        , getOrganizer(), guests);
    }
}
