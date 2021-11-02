package ru.avalon.javapp.devj110.filesdemo;

public class ImageFile extends Files{
    private Dimension imageDimension;

    public ImageFile(String name, int size, FileFormats fileFormat, int wight, int height) {
        super(name, size, fileFormat);
        imageDimension = new Dimension(wight, height);
    }

    public Dimension getImageDimension() {
        return imageDimension;
    }

    public void setImageDimension(Dimension imageDimension) {
        if (imageDimension == null)
            throw new IllegalArgumentException("imageDimension can't be null");
        this.imageDimension = imageDimension;
    }

    @Override
    public String getDetailInfo() {
        return imageDimension.getDimensionString();
    }
}
