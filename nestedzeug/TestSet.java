package nestedzeug;

import java.util.EnumSet;

public class TestSet {
    public static void main(String[] args) {
        EnumSet<Planet> innerPlanets, outerPlanets, allPlanets;
        innerPlanets = EnumSet.of(Planet.NEPTUNE, Planet.VENUS);
        outerPlanets = EnumSet.of(Planet.Erde, Planet.MERCURY);
        allPlanets = EnumSet.allOf(Planet.class);

        EnumSet<Planet> visitedPlanets;
        visitedPlanets = EnumSet.range(Planet.MERCURY, Planet.VENUS);
        System.out.println("visitedPlanets: "+ visitedPlanets);
        visitedPlanets.add(Planet.NEPTUNE);
        System.out.println(visitedPlanets);

    }
}
