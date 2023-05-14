package nestedzeug.JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> primeNumbers = new TreeSet<>(); primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(4);
        primeNumbers.add(5);
        System.out.println("Prime Numbers: " + primeNumbers);
        primeNumbers.remove(4);
        System.out.println("Prime Numbers: " + primeNumbers);

        Iterator<Integer> primeNumbersIterator = primeNumbers.iterator();
        System.out.println("Prime Numbers using Iterator: ");
        while(primeNumbersIterator.hasNext()) {
            System.out.println(primeNumbersIterator.next() + " ");
        }
    }
}
