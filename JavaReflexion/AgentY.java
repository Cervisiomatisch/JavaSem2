package JavaReflexion;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AgentY {
    public static void main(String[] args) {
        testAgentX();
    }
    public static void initAllClass(){
        System.out.println("Agent Y starts ...");
        new ClassA();
        System.out.println("After creating ClassA");
        try {
            Class.forName("JavaReflexion.ClassB");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassB missing ...");
        }
        System.out.println("After trying something ...");
        new ClassC();
    }
    public static void testClassReferenz(){
        //Test über .getClass
        ClassA aDing = new ClassA();
        Class classTest1 = aDing.getClass();
        System.out.println(classTest1);
        //Test über .class
        Class classTest2 = ClassB.class;
        System.out.println(classTest2);
        //Test über Klassennamen
        Class<?> classTest3 = null;
        try {
            classTest3 = Class.forName("JavaReflexion.ClassC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(classTest3);
    }
    public static void testAgentX(){
        //Aufgabe 1
        AgentX whois = new AgentX();
        //Aufgabe 2
        Class MetaTest1 = whois.getClass();
        System.out.println(MetaTest1);
        //Aufgabe 3
        Class MetaTest2 = MetaTest1.getClass();
        System.out.println(MetaTest2);
        //Aufgabe 4
        Class MetaTest3 = MetaTest2.getClass();
        System.out.println(MetaTest3);
        //Zugriffsmodifizierer, Instanzvariablen, Methoden von AgentX
        Class aClass = AgentX.class;
        Method methods[] = aClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName() + " : " + Modifier.toString(m.getModifiers()));
        }
        System.out.println("Neu:");
        AgentX firstAgent = new AgentX("James", 30);
        Class<?> classFirstAgent = firstAgent.getClass();
        Field fields[] = classFirstAgent.getDeclaredFields();
        Method method[] = classFirstAgent.getDeclaredMethods();
        Arrays.stream(fields).toList().forEach(m -> System.out.println(m.toString()));
        //Aufgabe 9
        HashSet<AgentX> meineAgency = new HashSet<AgentX>();
        meineAgency.add(firstAgent);
        AgentX fakeAgent = null;
        try {
            fakeAgent = (AgentX) classFirstAgent.getConstructor().newInstance();
            //besser: fakeAgent = (AgentX) classFirstAgent.getConstructor(String.class, int.class).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        meineAgency.add(fakeAgent);
        System.out.println(meineAgency);



    }
}

