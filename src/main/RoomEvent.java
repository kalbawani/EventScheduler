package main;

public class RoomEvent extends Event {
    private Time startTime;
    private Time endTime;
    private Room room;

    public RoomEvent(int id, String name, Date date, Time startTime, Time endTime, Room room) {
        super(id, name, date);
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "%n    Start Time: %s" +
                                "%n    End Time: %s" +
                                "%n    Room: %s"
                        , getStartTime(), getEndTime(), getRoom());
    }
}
