package nestedzeug;

public class Waldtest {
    public static void main(String[] args) {
        Wald forest = new Wald.waldbuilder("Mischwald", "Sachsen").flaeche(300)
                .baumhohe(30).nachhaltig(true).anpflanzen();
        System.out.println(forest);
    }
}
