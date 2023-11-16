package main;

public class Time {
    private int seconds;

    public Time(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time() {
        this(0, 0, 0);
    }

    public int getHour() {
        return seconds / 3600;
    }

    public int getMinute() {
        return seconds % 3600 / 60;
    }

    public int getSecond() {
        return seconds % 60;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23!");
        }

        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59!");
        }

        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Hour must be between 0 and 59!");
        }

        this.seconds = hour * 3600 + minute * 60 + second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", (getHour() == 0 || getHour() == 12 ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return this.seconds == time.seconds;
    }

}
