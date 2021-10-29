package ru.avalon.javapp.devj110.filesdemo;

public class MultimediaFile extends Files{
    private String contentName;

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

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        if (contentName == null)
            throw new IllegalArgumentException("contentName can't be null.");
        this.contentName = contentName;
    }

    @Override
    public String getDetailInfo() {
        return "";
    }
}
