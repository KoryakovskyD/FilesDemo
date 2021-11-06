package ru.avalon.javapp.devj110.filesdemo;

public abstract class MultimediaFile extends Files{
    private String contentName;
    private Duration duration;

    public MultimediaFile(String name, int size, FileFormats fileFormat, String contentName, int minutes, int seconds) {
        super(name, size, fileFormat);
        setContentName(contentName);
        setDuration(new Duration(minutes, seconds));
    }

    public MultimediaFile(String name, int size, FileFormats fileFormat, String contentName, int hours, int minutes, int seconds) {
        super(name, size, fileFormat);
        setContentName(contentName);
        setDuration(new Duration(hours, minutes, seconds));
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        if (duration == null)
            throw new IllegalArgumentException("duration can't be null");
        this.duration = duration;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        if (contentName == null)
            throw new IllegalArgumentException("contentName can't be null.");
        this.contentName = contentName;
    }

    public String getGeneralPrint() {
        return getContentName() + ", " + getDuration().getDurationString();
    }
}
