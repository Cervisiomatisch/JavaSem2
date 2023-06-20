package KlausurVorbereitung;

import java.io.FileWriter;
import java.io.IOException;

public class InputOutputStream {

    public static void main(String[] args) throws IOException {
        //
        //try (FileInputStream inputStream = new FileInputStream("clown.ser");
        //     ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
        //    Clown deserializedClowns = (Clown) objectInputStream.readObject();
        //    System.out.println(deserializedClowns.getName());
        //} catch (IOException | ClassNotFoundException e) {
        //    throw new RuntimeException(e);
        //}
        try(FileWriter fileWriter = new FileWriter("testDings.txt", true)) {
            fileWriter.write("Wird das jetzt gespeichert?");
        }

    }
}
