package nestedzeug.JavaCollections;

public class Mouse {
    //Variablen
    private String name;
    private int ownedCheese;

    //Konstruktor
    public Mouse(){
        name = "Namenlos";
        ownedCheese = 0;
    }
    public Mouse(String name, int ownedCheese){
        this.name = name;
        this.ownedCheese = ownedCheese;
    }
    //getter
    public String getName() {
        return name;
    }
    public int getOwnedCheese() {
        return ownedCheese;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setOwnedCheese(int ownedCheese) {
        this.ownedCheese = ownedCheese;
    }

    @Override
    public String toString() {
        return "Die Maus heißt " + this.name + " und besitzt " + this.ownedCheese + " Käsestücken";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

