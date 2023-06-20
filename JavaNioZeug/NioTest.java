package JavaNioZeug;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NioTest {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("srcDinger/Blumen.png");
        System.out.println("FilePath: ");
        System.out.println(filePath);
        System.out.println(filePath.getFileName());
        System.out.println(filePath.getNameCount());
        System.out.println(filePath.getFileSystem());
        System.out.println("FullPath: ");
        Path fullPath = filePath.toAbsolutePath();
        System.out.println(fullPath);
        System.out.println(fullPath.getFileName());
        System.out.println(fullPath.getNameCount());
        System.out.println(fullPath.getFileSystem());
        System.out.println("Vergleich:");
        System.out.println(fullPath.equals(filePath));
        System.out.println("Dateityp:");
        System.out.println(Files.isRegularFile(fullPath));
        System.out.println(Files.isSameFile(filePath, fullPath));
        System.out.println("Files kopieren und löschen");
        Path copyPath = Path.of("./srcDinger/copyBlumen.png");
        Files.copy(filePath, copyPath, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
        //Files.deleteIfExists(copyPath);
        //System.out.println("Verzeichnis erstellen");
        Path dirPath = Path.of("./srcDinger/Test");
        Files.createDirectories(dirPath);
        //File verschieben
        Files.copy(filePath, copyPath, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
        Path targetPath = dirPath.resolve(copyPath.getFileName());
        Files.move(copyPath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Basic File Attributes");
        BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
        System.out.println(attr.lastAccessTime());
        System.out.println(attr.size());
        System.out.println(attr.fileKey());


    }
}
