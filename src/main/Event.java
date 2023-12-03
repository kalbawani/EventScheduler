package main;

import java.util.Objects;

public class Event {
    private int id;
    private String name;
    private Date date;

    public Event(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = new Date(date);
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

    @Override
    public String toString() {
        return String.format("%s (ID: %d)" +
                        "%n    Date: %s"
                , getName(), getId(), getDate());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id && Objects.equals(name, event.name) && Objects.equals(date, event.date);
    }
}
