package ru.avalon.javapp.devj110.filesdemo;

public class ImageFile extends Files{
    private Dimension imageDimension;

    public ImageFile(String name, int size, FileFormats fileFormat, int wight, int height) {
        super(name, size, fileFormat);
        imageDimension = new Dimension(wight, height);
    }

    @Override
    public String getDetailInfo() {
        return imageDimension.getDimensionString();
    }
}
