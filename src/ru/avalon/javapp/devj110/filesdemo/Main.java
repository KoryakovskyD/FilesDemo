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



        Files.printAll(files);

        // Создайте массив на базе одного из дочерних типов и заполните его несколькими объектами
        // Так как MultimediaFile наследуется от Files, то ему доступен метод printAll. Поэтому он способен распечатать
        // любой массив на базе дочерего.
        MultimediaFile[] mf = {
                new AudioFile("06-PrettyGirl.mp3",  7893454, FileFormats.AUDIO, "Eric Clapton, Pretty Girl", 05, 28),
                new VideoFile("BackToTheFuture1.avi", 1470984192, FileFormats.VIDEO,
                        "Back to the future I, 1985", 01, 48, 8, 640, 352)
        };

        System.out.println("\n\nМассив на базе дочернего списка.\n");
        MultimediaFile.printAll(mf);

    }
}
