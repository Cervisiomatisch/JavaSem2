package ObjektLang;

import java.io.Serializable;
import java.util.Objects;

public class Clown implements Cloneable, Serializable {
    private String name;
    private int laughFactor;
    private Circus circus;
    public Clown(){
        this.name = "undefined";
        this.laughFactor = 0;
        this.circus = new Circus();
    }

    public Clown(String name, int laughFactor, Circus circus) {
        this.name = name;
        this.laughFactor = laughFactor;
        this.circus = circus;
    }

    public Clown(String name, String laughFactor, Circus circus) {
        this.name = name;
        try {
            this.laughFactor = Integer.parseInt(laughFactor);
        } catch (NumberFormatException e) {}
        this.circus = circus;
    }

    public String getName() {
        return name;
    }

    public int getLaughFactor() {
        return laughFactor;
    }

    public Circus getCircus() {
        return circus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaughFactor(int laughFactor) {
        this.laughFactor = laughFactor;
    }

    public void setCircus(Circus circus) {
        this.circus = circus;
    }

    @Override
    public String toString() {
        return "Clown{" +
                "name='" + name + '\'' +
                ", laughFactor=" + laughFactor +
                ", circus=" + circus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clown clown = (Clown) o;
        return getLaughFactor() == clown.getLaughFactor() && getName().equals(clown.getName()) && getCircus().equals(clown.getCircus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLaughFactor(), getCircus());
    }
    //selbstgemachte tiefe Kopie
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Clown clonedClown = (Clown) super.clone();
        clonedClown.circus = (Circus) circus.clone();
        return clonedClown;
    }
}
