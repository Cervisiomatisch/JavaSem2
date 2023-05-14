package nestedzeug;

public interface Loadable {
    public abstract void load();

    public class CargoHold {
        boolean cargoHoldOpen = false;

        boolean statusCargoHold(){
            return cargoHoldOpen;
        }
        void openCargoHold(){
            cargoHoldOpen = true;
        }
        void closeCargoHold(){
            cargoHoldOpen = false;
        }
    }

    static public class Helper {
        static public void startMessage() {
            System.out.println("Ich werde beladen.");
        }
        static public void finishMessage() {
            System.out.println("Ich bin fertig beladen.");
        }
    }
}
