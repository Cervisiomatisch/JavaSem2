package nestedzeug.JavaCollections;
import java.util.*;

public class TestTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> shelfContent = new TreeMap<>();
        shelfContent.put(3, "Computer Programming Books");
        shelfContent.put(2, "Web Technology Books");
        shelfContent.put(1, "Data Processing Books");
        shelfContent.put(4, "Science Fiction");
        int a = shelfContent.size();
        System.out.println("Länge der NavigableMap: " + a);
        System.out.println(shelfContent.subMap(0,a/2 + 1 ));
        System.out.println(shelfContent.subMap(a/2+1, a+1 ));
    }
}
