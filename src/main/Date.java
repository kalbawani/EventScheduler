package main;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }

    // Copy constructor
    public Date(Date date) {
        setDate(date.getDay(), date.month, date.year);
    }

    public void setDate(int day, int month, int year) {
        if (year < 2023 || year > 2025) {
            throw new IllegalArgumentException("Year must be between 2023 and 2025!");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12!");
        }

        int lastDay = computeLastDay(month, year);

        if (day < 0 || day > lastDay) {
            throw new IllegalArgumentException("day must be between 0 and " + lastDay + "!");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static int computeLastDay(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return  (year % 4 == 0 ? 29 : 28);
            default:
                return 30;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d", getDay(), getMonth(), getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }
}
