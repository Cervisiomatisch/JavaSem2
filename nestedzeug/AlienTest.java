package nestedzeug;

public class AlienTest {
    public static void main(String[] args) {
        Alien firstAlien = new Alien("Alfons", 51, "Alpha Data P");
        Alien secondAlien = new Alien("Alfons", 51, "Alpha Data P");
        Alien thirdAlien = new Alien("nichtAlfons");
        Alien anderer = new Alien("Anderson");
        Alien dingens = new Alien("Blümel", 32);
        System.out.println(firstAlien.name());
        System.out.println(firstAlien.alienID());
        System.out.println(firstAlien.homePlanet());
        System.out.println(firstAlien);
        System.out.println(firstAlien.equals(secondAlien));
        System.out.println(thirdAlien);
        System.out.println(anderer);
        System.out.println(dingens);
        firstAlien.sayHello();
        dingens.sayHello();

    }
}
