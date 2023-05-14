package nestedzeug.JavaCollections;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> emailAlias = new HashMap<>();
        emailAlias.put("Picard", "captain@sternenflotte.erde");
        emailAlias.put("Worf", "klingone@mail.kronos");
        emailAlias.put("Guinan", "info@zehn-vorne.schiff");
        emailAlias.put("Troi", "gedanken@ueberall.all");
        emailAlias.put("IchWillNachHause", "HeuteBleibeIch@Home.de");
        System.out.println("Guinan: " + emailAlias.get("Guinan"));
        emailAlias.replace("Guinan","info@guinan.schiff.de");
        System.out.println(emailAlias.values());

    }
}
