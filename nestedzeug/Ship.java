package nestedzeug;

public abstract class Ship {
    public abstract void giveAHint();
    public abstract void rudern();
    //Variablen
    public String name;
    public String type = "Schnellboot";

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Ship(String einName, String einType){
        name = einName;
        type = einType;
    }
}
