package serialDeserial;

import ObjektLang.Clown;
import ObjektLang.Circus;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class IOTestClass {


    public static void main(String[] args) throws IOException {
        Clown myClown = new Clown("Kasper", 1, new Circus("JavaFun", 1));
        FileOutputStream fileOut = null;
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream("clown.ser");
            out = new ObjectOutputStream(fileOut);
            out.writeObject(myClown);
            out.close();
            fileOut.close();
            System.out.println("Clown wurde erfolgreich serialisiert.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }

        try (
                FileInputStream fileIn = new FileInputStream("clown.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
        ) {
            Clown deserializedClown = (Clown) in.readObject();
            System.out.println("Clown " + deserializedClown.getName() + " wurde erfolgreich deserialisiert.");
            System.out.println("Daten: " + deserializedClown);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Filewriter
        String coolesDing = "Jonas ist ein cooler Otto.";
        try (FileWriter writer = new FileWriter("StoryAboutJonas.txt");
             FileWriter addWriter = new FileWriter("StoryAboutJonas.txt", true);
        ) {
            writer.write("Story: \n");
            for (int i = 1; i <= 10; i++) {
                addWriter.write(i + ": " + coolesDing + "\n");
            }
        }
        int[] height = {2962, 2874, 2750};
        String[] peak = {"Zugspitze", "Schneefernkopf", "Mittlere Wetterspitze"};

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("peak.data"));
        ) {
            for (int i = 0; i < height.length; i++) {
                dataOutputStream.writeInt(height[i]);
                dataOutputStream.writeUTF(peak[i]);
            }
        }
        int readHeight;
        String readPeak;
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("peak.data"))
        ) {
            while (true) {
                readHeight = dataInputStream.readInt();
                readPeak = dataInputStream.readUTF();
                System.out.println(readPeak + ": " + readHeight);
            }
        } catch (EOFException e) {
        }

        try (
                FileInputStream fileIn = new FileInputStream("clown.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
        ) {
            Clown deserializedClown = (Clown) in.readObject();
        } catch (IOException | ClassNotFoundException e) {}

        //Aufgabe 7
        try (
                FileInputStream fileInputStream = new FileInputStream("FileWriterTest.txt");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)
        ) {
                int r = bufferedInputStream.read();
                while (r != -1) {
                System.out.print((char)r);
                r = bufferedInputStream.read();
                System.out.println(r);
            }
        } catch (IOException e) {

        }

        try (
                FileReader fileReader = new FileReader("FileWriterTest.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String r = bufferedReader.readLine();
            while (r != null) {
                System.out.print(r);
            }
        } catch (IOException e) {}
        //Bilder einlesen
        try (FileInputStream fileInputStream = new FileInputStream("./srcDinger/blumen.png");
             FileOutputStream fileOutputStream = new FileOutputStream("./srcDinger/bunte_blumen.jpg")
        ) {
            BufferedImage image = ImageIO.read(fileInputStream);
            BufferedImage convertedImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            convertedImage.createGraphics().drawImage(image, 0, 0, Color.WHITE, null);


            boolean canWrite = ImageIO.write(convertedImage, "jpg", fileOutputStream); if (!canWrite) {
                throw new IllegalStateException("Failed to write image."); }
        } catch (IOException e) { e.printStackTrace();}
        System.err.print("Das ist ein Fehler!");
    }
}


