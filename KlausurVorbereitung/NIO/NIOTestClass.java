package KlausurVorbereitung.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NIOTestClass {
    public static void main(String[] args) throws IOException {
        Path meinPfad = Path.of("srcDinger/Blumen.png");
        Path absoluterPfad = meinPfad.toAbsolutePath();
        System.out.println(absoluterPfad);
        //Weitere sinnlose Methoden
        System.out.println(absoluterPfad.getName(1));
        System.out.println(absoluterPfad.equals(meinPfad));
        System.out.println(absoluterPfad.getNameCount());
        //Aufgabe 14
        System.out.println(Files.isRegularFile(absoluterPfad));
        //Aufgabe 15
        System.out.println(Files.isSameFile(absoluterPfad, meinPfad));
        //Aufgabe 16
        Path dirPfad = Path.of("KlausurVorbereitung/NIO/meinCopyDir");
        try{Files.createDirectories(dirPfad);} catch (Exception e){}
        Path copyFilePath = Path.of("KlausurVorbereitung/NIO/meinCopyDir/CopyFile.png");
        Files.copy(absoluterPfad, copyFilePath, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
    }
}
