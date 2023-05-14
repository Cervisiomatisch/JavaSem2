package serialDeserial;

import ObjektLang.Circus;
import ObjektLang.Clown;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClownTest {
    private static List<Clown> meineClowns = new ArrayList<>();

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./srcDinger/clowns.csv"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                Scanner s = new Scanner(line).useDelimiter(",|:");
                meineClowns.add(new Clown(s.next(), s.next(), new Circus(s.next(), s.next())));
                line = bufferedReader.readLine();
                s.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(meineClowns);
    }
}
