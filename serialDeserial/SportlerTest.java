package serialDeserial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SportlerTest {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./srcDinger/sportler.csv"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                Scanner s = new Scanner(line).useDelimiter(",|;");
                System.out.println("Name: " + s.next() + ", Alter: "
                        + s.next() + ", Sportart: " + s.next());
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

