package KlausurVorbereitung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

public class SECHSLambda {
    //Lambda ist eine Abkürzung davon
    public static void main(String[] args) {
        SECHSInterface wub = (a, b) -> {
            int z = a + b;
            System.out.println("Das Ergebnis ist: " + z);
        };
        wub.rechnen(1, 2);
        //Mit Klassen
        List<String> myFruitWords = new ArrayList<>();
        myFruitWords.add("apple");
        myFruitWords.add("banana");
        myFruitWords.forEach(i -> System.out.println(i));

        IntBinaryOperator dingsbums = (a, b) -> (a+b) * (a+b);
        System.out.println(dingsbums.applyAsInt(1, 2));
        myFruitWords.stream().forEach(obj -> System.out.println(obj));
    }

}
