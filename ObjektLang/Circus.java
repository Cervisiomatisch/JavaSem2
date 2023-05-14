package ObjektLang;

import java.io.Serializable;
import java.util.Objects;

public class Circus implements Cloneable, Serializable {
    private String name;
    private int id;
    public Circus(){
        name = "undefined";
        id = 0;
    }
    public Circus(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Circus(String name, String id) {
        this.name = name;
        try {
            this.id = Integer.parseInt(id);
        } catch (NumberFormatException e) {}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Circus{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circus circus = (Circus) o;
        return getId() == circus.getId() && getName().equals(circus.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
