package nestedzeug.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {

    public static void main(String[] args) {
        //Aus Collection
        List<String> obst = new ArrayList<>();
        obst.add("Apfel");
        obst.add("Banane");
        Stream<String> obststream = obst.stream();
        Stream<String> obstparallelstream = obst.parallelStream();
        //Aus Array
        Integer[] obstanzahl = {1, 2, 3, 4};
        Stream<Integer> obstanzahlstream = Arrays.stream(obstanzahl);
        Stream<Integer> obstanzahlparallelstream = Arrays.stream(obstanzahl).parallel();

    }
}
