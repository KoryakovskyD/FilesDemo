package ru.avalon.javapp.devj110.filesdemo;

public class AudioFile extends MultimediaFile{
    public AudioFile(String name, int size, FileFormats fileFormat, String contentName, int hours, int minutes) {
        super(name, size, fileFormat, contentName, hours, minutes);
    }

    @Override
    public String getDetailInfo() {
        return getGeneralPrint();
    }
}
