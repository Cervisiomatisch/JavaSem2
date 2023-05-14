package nestedzeug.lambdastreams;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambdas {
    public static void main(String[] args) {
        List<String> myFruitWords = new ArrayList<>();
        myFruitWords.add("apple");
        myFruitWords.add("cucumber");

        /* ohne lambda-Ausdruck
        myFruitWords.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Fruit: " + s);
            }
        });
        */
        //mit lambda-Ausdruck
        myFruitWords.forEach(aWord -> System.out.println("Fruit: " + aWord));

        //mit Methodenreferenz
        myFruitWords.sort(String::compareToIgnoreCase);
        myFruitWords.forEach(System.out::println);


    }
}
