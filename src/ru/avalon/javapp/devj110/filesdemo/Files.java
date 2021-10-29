package ru.avalon.javapp.devj110.filesdemo;

public abstract class Files {

    private String name;
    private int size;
    private FileFormats fileFormat;
    private Duration duration;

    public Files(String name, int size, FileFormats fileFormat) {
        setName(name);
        setSize(size);
        setFileFormat(fileFormat);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
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

    public String getSizeLength() {
        return Integer.toString(size);
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

    public void print(int firstNum, int secondNum) {
        //System.out.print(name + "| " + size + "| " + fileFormat + ", ");
        System.out.printf("%-20s|%10d|%s, ", name,  size, fileFormat);
        System.out.print(getDetailInfo());
    }

    public static void printAll(Files[] files,int firstNum, int secondNum) {
        System.out.println("    File name       |    Size  |   Details");
        System.out.println("--------------------------------------------");
        for (Files f : files) {
            f.print(firstNum, secondNum);
            System.out.println();
        }
    }
}
