package nestedzeug;
import java.util.ArrayList;

public class Port {
    public static String name;
    ArrayList<ShipAtPort> registeredShips = new ArrayList<>();

    public static String getName() {
        return name;
    }
    public ArrayList<ShipAtPort> getRegisteredShips() {
        return registeredShips;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Port(String einName){
        name = einName;
    }
    public void addRegisteredShip(ShipAtPort ship){
        registeredShips.add(ship);
    }
    public static class ShipAtPort extends Ship{
        public static int numberOfRegisteredShips = 0;
        public int numberInRegister;

        public void giveAHint() {
            System.out.println("Hier liege ich");
        }

        @Override
        public void rudern() {
            System.out.println("ruder ruder");
        }

        public ShipAtPort(String name, String bootTyp){
            super(name, bootTyp);
            numberInRegister = numberOfRegisteredShips;
            numberOfRegisteredShips += 1;
        }


        @Override
        public String toString(){
            return "Name Port: " + Port.getName() + "\n" +
                    "Name Schiff: " + getName() + "\n" +
                    "Typ Schiff: " + getType() + "\n" +
                    "Registrierte Nummer: " + numberInRegister;
        }
    }

    public static void main(String[] args) {
        Port meinHafen = new Port("Tortuga");
        meinHafen.addRegisteredShip(new ShipAtPort("Black Pearl", "Schnellboot"));
        System.out.println(meinHafen.getRegisteredShips());
    }
}
