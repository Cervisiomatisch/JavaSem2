package nestedzeug;

public class CargoShip extends Ship implements Loadable{

    CargoHold cargo = new CargoHold();

    public CargoShip(String einName, String einType) {
        super(einName, einType);

    }
    @Override
    public void load() {
        Helper.startMessage();
        cargo.openCargoHold();
        Helper.finishMessage();
        cargo.closeCargoHold();
    }
    @Override
    public void giveAHint() {
        System.out.println("Das ist ein Cargo-Ship");
    }
    @Override
    public void rudern() {
        System.out.println("Ich ruder nicht!");
    }

    public static void main(String[] args) {
        CargoShip meinBoot = new CargoShip("Schiff", "CargoShip");
        meinBoot.load();
    }
}
