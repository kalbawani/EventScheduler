package main;

public class DeadlineEvent extends Event {
    private Time time;

    public DeadlineEvent(int id, String name, Date date, Time time) {
        super(id, name, date);
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "%n    Time: %s"
                        , getTime());
    }
}
