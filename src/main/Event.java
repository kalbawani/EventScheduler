package main;

import java.util.Objects;

public class Event {
    private int id;
    private String name;
    private Date date;
    private Time time;
    private Room room;
    private int participantCount;
    private Employee organizer;

    public Event(int id, String name, Date date, Time time, Room room, int participantCount, Employee organizer) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.room = room;
        this.participantCount = participantCount;
        this.organizer = organizer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public Room getRoom() {
        return room;
    }

    public int getParticipantCount() {
        return participantCount;
    }

    public Employee getOrganizer() {
        return organizer;
    }

    @Override
    public String toString() {
        return String.format("%s (ID: %d)" +
                        "%n    Date: %s" +
                        "%n    Time: %s" +
                        "%n    Room: %s" +
                        "%n    #Participants: %d" +
                        "%n    Organizer: %s"
                , name, id, date, time, room, participantCount, organizer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id && Objects.equals(name, event.name) && Objects.equals(date, event.date) && Objects.equals(time, event.time) && Objects.equals(room, event.room) && participantCount == event.participantCount && Objects.equals(organizer, event.organizer);
    }
}
