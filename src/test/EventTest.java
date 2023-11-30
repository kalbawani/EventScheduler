package test;

import main.*;

public class EventTest {
    public static void main(String[] args) {
        Date date = new Date(27, 11, 2023);
        Time time = new Time(8,0);
        Location location = new Location("Adickesallee", 32, 3);
        Room room = new Room("S3.03", location, 20);
        Employee employee = new Employee(111, "Will", "Smith", "w.smith@fs.de");

        Event event = new Event(111, "zzz", date);
        System.out.println(event);

        System.out.println();

        DeadlineEvent deadline = new DeadlineEvent(111, "Assignment 10", date, time);

        System.out.println(deadline);
    }
}
