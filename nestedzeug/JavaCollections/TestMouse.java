package nestedzeug.JavaCollections;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMouse {

    public static void main(String[] args) {
        List<Mouse> ourMice = new ArrayList<>();
        ourMice.add(new Mouse("Stuart", 10));
        for (int i = 0; i < 100; i++) {
            ourMice.add(new Mouse("Maus:" + UUID.randomUUID().toString().substring(0,7), (int) (Math.random() * 50)));
        }
        ourMice.stream().forEach(mouse -> System.out.println(mouse.toString()));
        System.out.println("first mouse: " + ourMice.stream().findFirst());
        System.out.println("any mouse: " + ourMice.stream().findAny());
        System.out.println("all mouse over poorboarder (poverty line): " + ourMice.stream().allMatch(mouse -> mouse.getOwnedCheese() > 5));
        System.out.println("population size: " + ourMice.stream().count());
        System.out.println("poor mouse: " + ourMice.stream().min((mouse1, mouse2) ->  Integer.compare(mouse1.getOwnedCheese(), mouse2.getOwnedCheese())).orElse(null));
        System.out.println("richest mouse: " + ourMice.stream().max((mouse1, mouse2) ->  Integer.compare(mouse1.getOwnedCheese(), mouse2.getOwnedCheese())).orElse(null));

        System.out.println("Mit Supplier:");
        Stream<Mouse> someMiceStream = ourMice.stream();
        Supplier<Stream<Mouse>> streamSupplier = ourMice::stream;
        streamSupplier.get().forEach(mouse -> System.out.println(mouse.toString()));

        //Intermediäre Operationen
        ourMice.add(new Mouse("Erik", 30));
        ourMice.add(new Mouse("Erik", 30));
        ourMice.stream().distinct().forEach(mouse -> System.out.println("Distinct: " + mouse.getName()));
        ourMice.stream().limit(5).forEach(mouse -> System.out.println("Limit(5) " + mouse.getName()));
        ourMice.stream().skip(90).forEach(mouse -> System.out.println("Skip(90) " + mouse.getName()));
        System.out.println(ourMice.stream().filter(mouse->mouse.getOwnedCheese()>10).count());
        ourMice.stream().sorted((mouse1,mouse2) -> mouse1.getOwnedCheese()-mouse2.getOwnedCheese())
                .forEach(mouse -> System.out.println("Sorted: Name: " + mouse.getName() + " Cheese: " + mouse.getOwnedCheese()));
        ourMice.stream().map(Mouse::getOwnedCheese) .forEach(partOfMouse -> System.out.println("Cheese information: " + partOfMouse));
        ourMice.stream().sorted((mouse1,mouse2) ->  mouse2.getOwnedCheese() - mouse1.getOwnedCheese())
                .forEach(mouse -> System.out.println("Sorted: Name: " + mouse.getName() + " Cheese: " + mouse.getOwnedCheese()));
        ourMice.stream().filter(mouse -> mouse.getOwnedCheese()>40) .forEach(mouse -> System.out.println("Rich Mouse Name: " +
                mouse.getName()));
        System.out.println("Start with Maus:2");
        ourMice.stream().filter(mouse -> mouse.getName().startsWith("Maus:2")) .forEach(mouse -> System.out.println("-> " +
                mouse.getName()));
        List<Integer> cooleMaus = ourMice.stream().limit(20).map(Mouse::getOwnedCheese).distinct().sorted().collect(Collectors.toList());
        System.out.println("coole Maus");
        cooleMaus.forEach(mouse -> System.out.println(mouse.toString()));

    }
}
