package ru.avalon.javapp.devj110.filesdemo;


public class Main {
    public static void main(String[] args) {
        Files[] files = {
                new DocFile("j110-lab2-hiers.docx", 23212, FileFormats.DOCX, 2),
                new ImageFile("spb-map.png", 1703527, FileFormats.IMAGE, 1024, 3072),
                new AudioFile("06-PrettyGirl.mp3", 7893454, FileFormats.AUDIO, "Eric Clapton, Pretty Girl", 05, 28),
                new VideoFile("BackToTheFuture1.avi", 1470984192, FileFormats.VIDEO,
                        "Back to the future I, 1985", 01, 48, 8, 640, 352)
        };

        /*2
            В данном блоке я нашел максимальную длину имени и размера, но не понимаю как передать этот размер
            в printf (%20d). Так как в этой задаче таблица не главное, то подумаю потом.
         */
        int maxLengthName=0;
        int maxLengthSize=0;
        for (Files f:files) {
            int curLengthName = f.getNameLength();
            int curLengthSize = new Integer(f.getSizeLength());

            if (curLengthName > maxLengthName)
                maxLengthName = curLengthName;

            if (curLengthSize > maxLengthSize)
                maxLengthSize = curLengthSize;
        }

        Files.printAll(files, maxLengthName, maxLengthSize);
    }
}
