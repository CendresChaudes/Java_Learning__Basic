package oop.basic;

public class TimeInterval {
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTES_IN_HOUR = 60;

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds) {
        final int SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTES_IN_HOUR;

        this.hours = seconds / SECONDS_IN_HOUR;
        this.minutes = seconds % SECONDS_IN_HOUR / MINUTES_IN_HOUR;
        this.seconds = seconds % SECONDS_IN_HOUR % SECONDS_IN_MINUTE;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getTimeIntervalInSeconds() {
        return seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_MINUTE * MINUTES_IN_HOUR;
    }

    public void print() {
        System.out.println("Количество секунд: " + this.getTimeIntervalInSeconds());
    }
}
