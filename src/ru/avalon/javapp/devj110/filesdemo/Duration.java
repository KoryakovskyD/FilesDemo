package ru.avalon.javapp.devj110.filesdemo;

public class Duration {
    private int hours;
    private int minutes;
    private int seconds;

    public Duration(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Duration(int minutes, int seconds) {
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours <= 0 || hours > 24)
            throw new IllegalArgumentException("hours must be a number between 1 and 24.");
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 60)
            throw new IllegalArgumentException("minutes must be a number between 0 and 60.");
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60)
            throw new IllegalArgumentException("seconds must be a number between 1 and 24.");
        this.seconds = seconds;
    }

    public String getDurationString() {
        if (hours == 0)
            return getMinutes() + ":" + getSeconds();
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }

}
