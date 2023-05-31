package KlausurVorbereitung;

import java.util.Objects;

public record DREITiere(String name, String art, int tierID) {


    public String toString() {
        return "Name: " + name + ", Art: " + art + ", TierID: " + tierID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DREITiere dreiTiere = (DREITiere) o;
        return tierID == dreiTiere.tierID && name.equals(dreiTiere.name) && art.equals(dreiTiere.art);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, art, tierID);
    }
    public static int ERSATZ_ID = 10000;

    public DREITiere(String name, String art){
        this(name, art, ERSATZ_ID);
        ERSATZ_ID += 1;
    }
    public void ehmehmehmehm(){
        System.out.println("Hallo! ODer so oder bellen oder grunzen oder sowas. Mh ehm ich bin: " + name + " der Art: " + art);
    }
}
