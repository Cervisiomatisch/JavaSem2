package nestedzeug.JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> destination = new ArrayList<>(1000);
        destination.add("Leipzig");
        destination.add("Berlin");
        destination.add("Rostock");
        destination.add("Leipzig");
        destination.add("Frankfurt");
        destination.add("Hamburg");
        destination.add("Leipzig");
        showList(destination);
        destination.remove("Leipzig");
        showList(destination);
        Iterator<String> destinationIterator = destination.iterator();
        System.out.println("Mit Iterator:");
        while(destinationIterator.hasNext()) {
            System.out.println(destinationIterator.next());
        }
    }
    public static void showList(ArrayList<String> destination) {
        for (String s : destination) {
            System.out.println(s);
        }
        System.out.println("------------------");
    }
}
