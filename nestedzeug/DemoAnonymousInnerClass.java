package nestedzeug;

public class DemoAnonymousInnerClass {
    public static void main (String args[]) {

        //Gleich hinter der Initialisierung eine Methode schreiben
        Ship rowboat = new Ship ("BlackPearl", "Schnellboot") {
            public void giveAHint () {
                System.out.println ("Ich bin ein Ruderboot.");
            }
            public void rudern () {
                System.out.println("Ich ruder ne Runde!");
            }
            @Override
            public String getName(){
                return "Cooles Ruderboot: " + super.getName();
            }
        };
        rowboat.giveAHint();
        rowboat.rudern();
        System.out.println(rowboat.getName());
        System.out.println(rowboat.getType());
    }
        }
