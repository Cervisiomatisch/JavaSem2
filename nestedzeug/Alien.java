package nestedzeug;

import java.util.Objects;

public record Alien(String name, int alienID, String homePlanet) {

    public Alien{
        Objects.requireNonNull(name);
    }
    public Alien(String name) {
        this(name, UNKNOWN_ALIEN_ID, UNKNOWN_HOME_PLANET);
        UNKNOWN_ALIEN_ID += 1;
    }
    public Alien(String name, int alienID) {
        this(name, alienID, UNKNOWN_HOME_PLANET);
    }
    public static String UNKNOWN_HOME_PLANET = "Unknown";
    public static int UNKNOWN_ALIEN_ID = 10000;

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", alienID=" + alienID +
                ", homePlanet='" + homePlanet + '\'' +
                '}';
    }
    public void sayHello(){
        if (Objects.equals(homePlanet, "Unknown")) {
            System.out.println("Hallo, ich bin "+ name +", habe die Nummer: " + alienID + " und habe keine Ahnung woher ich komme.");
        } else {
            System.out.println("Hallo, ich bin "+ name +", habe die Nummer: " + alienID + " und komme von " + homePlanet);
        }
    }
}
