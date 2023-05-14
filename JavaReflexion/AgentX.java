package JavaReflexion;

import java.util.Objects;

public class AgentX {
    private String name;
    private int age;

    public AgentX(){
        name = "unnamed";
        age = 0;
    }
    public AgentX(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof AgentX) return false;
        AgentX agentX = (AgentX) o;
        return age == agentX.age && name.equals(agentX.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
