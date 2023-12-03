package test;

import main.*;

public class EventTest {
    public static void main(String[] args) {
        Date date = new Date(27, 11, 2023);
        Time time = new Time(8,0);
        Location location = new Location("Adickesallee", 32, 3);
        Room room = new Room("S3.03", location, 20);
        Employee employee = new Employee(111, "Will", "Smith", "w.smith@fs.de");

        DeadlineEvent deadline = new DeadlineEvent(111, "Assignment 10", date, time);

        System.out.println(deadline);
        System.out.println();

        Time startTime = new Time(8,0);
        Time endTime = new Time(9,30);
        Employee manager = new Employee(123, "Tom", "Cruise", "tc@fs.de");
        Employee dean = new Employee(124, "Robert", "De Niro", "rd@fs.de");
        Employee[] guestList = {manager, dean, employee};

        MeetingEvent meeting = new MeetingEvent(222, "Weekly Meeting", date, startTime, endTime, room, employee, guestList);

        System.out.println(meeting);
        System.out.println();

        LectureEvent lecture = new LectureEvent(333, "Java Programming", date, startTime, endTime, room, employee, 11);

        System.out.println(lecture);
    }
}
