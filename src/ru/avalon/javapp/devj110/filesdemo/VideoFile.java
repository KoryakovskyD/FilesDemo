package ru.avalon.javapp.devj110.filesdemo;

public class VideoFile extends MultimediaFile{
    private Dimension dimension;

    public VideoFile(String name, int size, FileFormats fileFormat, String contentName, int hours, int minutes, int seconds, int wight, int height) {
        super(name, size, fileFormat, contentName, hours, minutes, seconds);
        dimension = new Dimension(wight, height);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        if (dimension == null)
            throw new IllegalArgumentException("dimension can't be null");
        this.dimension = dimension;
    }

    @Override
    public String getDetailInfo() {
        return getGeneralPrint() + ", " + dimension.getDimensionString();
    }
}
