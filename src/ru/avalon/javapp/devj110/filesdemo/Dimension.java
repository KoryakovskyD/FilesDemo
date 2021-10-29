package ru.avalon.javapp.devj110.filesdemo;

public class Dimension {
    private int wight;
    private int height;

    public Dimension(int wight, int height) {
        setWight(wight);
        setHeight(height);
    }

    public int getWight() {
        return wight;
    }

    public int getHeight() {
        return height;
    }

    public void setWight(int wight) {
        if (wight <= 0)
            throw new IllegalArgumentException("wight can't be 0 or minus.");
        this.wight = wight;
    }

    public void setHeight(int height) {
        if (height <= 0)
            throw new IllegalArgumentException("height can't be 0 or minus.");
        this.height = height;
    }

    public String getDimensionString() {
        return getWight() + "x" + getHeight();
    }
}
