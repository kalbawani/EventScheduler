package main;

import java.util.Objects;

public class Event {
    private int id;
    private String name;
    private Room room;
    private Time time;
    private Date date;
    private Employee organizer;
    private int participantCount;

    public Event(int id, String name, Room room, Time time, Date date, int participantCount, Employee organizer) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.time = time;
        this.date = date;
        this.participantCount = participantCount;
        this.organizer = organizer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Room getRoom() {
        return room;
    }

    public Time getTime() {
        return time;
    }

    public Date getDate() {
        return date;
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
                        "%n    Room: %s" +
                        "%n    Time:%s" +
                        "%n    Date: %s" +
                        "%n    #Participants: %d" +
                        "%n    Organizer: %s"
                , name, id, room, time, date, participantCount, organizer );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id && participantCount == event.participantCount && Objects.equals(name, event.name) && Objects.equals(room, event.room) && Objects.equals(time, event.time) && Objects.equals(date, event.date) && Objects.equals(organizer, event.organizer);
    }
}
