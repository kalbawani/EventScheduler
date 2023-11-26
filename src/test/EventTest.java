package test;

import main.Time;
import main.Date;
import main.Location;
import main.Room;
import main.Employee;
import main.Event;

public class EventTest {
    public static void main(String[] args) {
        Time time = new Time(11,0);
        Date date = new Date(12, 11, 2023);

        Location location = new Location("Adickesallee", 32, 1);
        Room room = new Room("S1.12", location, 20);
        Employee employee = new Employee(232, "Will", "Smith", "w.smith@fs.de");

        Event event = new Event(1, "Introduction to Programming", date, time, room, 30, employee);

        System.out.println(event);

        date.setDate(18, 12, 2023);

        System.out.println(event);
    }
}
