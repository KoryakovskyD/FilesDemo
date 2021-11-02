package ru.avalon.javapp.devj110.filesdemo;

public abstract class Files {

    private String name;
    private int size;
    private FileFormats fileFormat;

    public Files(String name, int size, FileFormats fileFormat) {
        setName(name);
        setSize(size);
        setFileFormat(fileFormat);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("name can't be null.");
        this.name = name;
    }

    public int getNameLength() {
        return name.length();
    }

    public int  getSizeLength() {
        return Integer.toString(size).length();
    }

    public void setSize(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("size can't be 0 or minus.");
        this.size = size;
    }

    public FileFormats getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(FileFormats fileFormat) {
        if (fileFormat == null)
            throw new IllegalArgumentException("fileFormat can't be null.");
        this.fileFormat = fileFormat;
    }

    public abstract String getDetailInfo();


    public void print(int maxLengthName, int maxLengthSize) {

        //System.out.print(name + "| " + size + "| " + fileFormat + ", ");
        String fmt = String.format("%%-%ds|%%%dd|%%s, ", maxLengthName, maxLengthSize);
        //String fmt1 = "%-" + firstNum + "s|%" + secondNum + "d|%s";
        //System.out.println(fmt);
        System.out.printf(fmt, name, size, fileFormat);
        //System.out.printf(fmt1, name, size, fileFormat);
        //System.out.println("maxN=" + maxLengthName +  "maxS=" + maxLengthSize);
        //System.out.printf("%-20s|%10d|%s, ", name,  size, fileFormat);
        System.out.print(getDetailInfo());
    }

    public static void printAll(Files[] files) {
        System.out.println("    File name       |    Size  |   Details");
        System.out.println("--------------------------------------------");

        int maxLengthName=0;
        int maxLengthSize=0;
        for (Files f : files) {
            int curLengthName = f.getNameLength();
            int curLengthSize = f.getSizeLength();

            if (curLengthName > maxLengthName)
                maxLengthName = curLengthName;

            if (curLengthSize > maxLengthSize)
                maxLengthSize = curLengthSize;
        }

        for (Files f : files) {
            f.print(maxLengthName, maxLengthSize);
            System.out.println();
        }
    }
}
