package nestedzeug;

public class Planettest {
    public static boolean isBig(Planet p){
        boolean b = switch (p) {
            case Erde -> false;
            case VENUS -> false;
            case MERCURY, NEPTUNE -> true;
        };
        return b;
    }
    public static void main(String[] args) {
        Planet p1 = Planet.Erde;
        System.out.println(isBig(p1));
        System.out.println(Planet.VENUS.name());
        System.out.println(Planet.valueOf("VENUS"));
        for (Planet p: Planet.values()){
            System.out.printf("Das Volumen von %s beträgt %.0f km3.%n", p, p.volumen());
        }

    }
}
