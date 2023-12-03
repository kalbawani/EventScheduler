package main;

public class LectureEvent extends RoomEvent {
    private Employee lecturer;
    private int studentCount;

    public LectureEvent(int id, String name, Date date, Time startTime, Time endTime, Room room, Employee lecturer, int studentCount) {
        super(id, name, date, startTime, endTime, room);
        this.lecturer = lecturer;
        this.studentCount = studentCount;
    }

    public Employee getLecturer() {
        return lecturer;
    }

    public int getStudentCount() {
        return studentCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "%n    Lecturer: %s" +
                                "%n    Student Count: %d"
                        , getLecturer(), getStudentCount());
    }
}
