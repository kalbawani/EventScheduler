package test;

import main.Time;

public class TimeTest {
    public static void main(String[] args) {
        int h = 7;
        int m = 45;
        int s = 40;

        int seconds = Time.getSecondsSinceMidnight(h, m, s);
        System.out.println("# seconds = " + seconds);

        System.out.println(Time.SECONDS_PER_HOUR);

        Time time = new Time(14, 0);
        int x = 5;

        System.out.println("Time is: " + time + ",  x = " + x);

        foo(time, x);

        System.out.println("Time is: " + time + ",  x = " + x);
        System.out.println();

        Time t1 = new Time(15);
        Time t2 = new Time(15, 0);

        System.out.println("t1: " + t1 + ",  t2: " + t2);
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
    }

    static public void foo(Time time, int x) {
        time.setTime(9, 7, 39);
        x = 10;
        System.out.println("Time is: " + time + ",  x = " + x);
    }
}
