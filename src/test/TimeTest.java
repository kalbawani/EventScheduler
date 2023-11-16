package test;

import main.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(11, 0);
        int x = 5;

        System.out.println("Time is: " + time + ",  x = " + x);

        foo(time, x);

        System.out.println("Time is: " + time + ",  x = " + x);    }

    static public void foo(Time time, int x) {
        time.setTime(9, 7, 9);
        x = 10;
        System.out.println("Time is: " + time + ",  x = " + x);
    }
}
