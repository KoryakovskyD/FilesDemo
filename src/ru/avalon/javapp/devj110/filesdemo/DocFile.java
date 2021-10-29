package ru.avalon.javapp.devj110.filesdemo;

public class DocFile extends Files{
    private int countStr;

    public DocFile(String name, int size, FileFormats fileFormat, int countStr) {
        super(name, size, fileFormat);
        setCountStr(countStr);
    }

    public int getCountStr() {
        return countStr;
    }

    public void setCountStr(int countStr) {
        if (countStr <= 0)
            throw new IllegalArgumentException("countStr can't be 0 or minus.");
        this.countStr = countStr;
    }

    @Override
    public String getDetailInfo() {
        return getCountStr() + " pages";
    }
}
