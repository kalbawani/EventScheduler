package test;

import main.Time;

public class TimeTest {
    public static void main(String[] args) {
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
