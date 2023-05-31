package KlausurVorbereitung;

public class DREITiereTest {
    public static void main(String[] args) {
        DREITiere dings1 = new DREITiere("Olaf", "Schneemann", 9);
        System.out.println(dings1);
        DREITiere dings2 = new DREITiere("Olaf", "Schneemann", 9);
        System.out.println(dings2.equals(dings1));
        DREITiere dings3 = new DREITiere("Linus", "Affe");
        System.out.println(dings3);
        DREITiere dings4 = new DREITiere("Linus", "Affe");
        System.out.println(dings4);
        dings4.ehmehmehmehm();

    }
}
