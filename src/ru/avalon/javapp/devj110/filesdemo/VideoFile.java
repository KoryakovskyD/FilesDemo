package ru.avalon.javapp.devj110.filesdemo;

public class VideoFile extends MultimediaFile{
    private Dimension dimension;

    public VideoFile(String name, int size, FileFormats fileFormat, String contentName, int hours, int minutes, int seconds, int wight, int height) {
        super(name, size, fileFormat, contentName, hours, minutes, seconds);
        dimension = new Dimension(wight, height);
        setDuration(new Duration(hours, minutes, seconds));
    }


    @Override
    public String getDetailInfo() {
        return getContentName() + ", "  + getDuration().getDurationString() + ", " + dimension.getDimensionString();
    }
}
