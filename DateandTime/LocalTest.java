package DateandTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.zone.ZoneRules;
import java.time.zone.ZoneRulesProvider;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class LocalTest {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate harryPottersBirthday = LocalDate.of(1980, 7, 31);
        LocalDate garfieldsBirthday = LocalDate.of(1978, 6, 19);
        LocalDate bewitchedHarrysBirthday = harryPottersBirthday.minusYears(2);
        System.out.println("Wochentag von Harry Geburtstag: " + harryPottersBirthday.getDayOfWeek());
        System.out.println("Verzauberter Geburtstag: " + bewitchedHarrysBirthday);
        System.out.println("Garfields Geburtsjahr: " + garfieldsBirthday.getYear());
        // zu Aufgabe a
        System.out.println("Vor: " + harryPottersBirthday);
        harryPottersBirthday = harryPottersBirthday.plusYears(2);
        System.out.println("nach: " + harryPottersBirthday);
        //zu Aufgabe b
        LocalDate myBirthday = LocalDate.parse("2002-11-22");
        //zu aufgabe c
        System.out.println("Harry jünger: " + harryPottersBirthday.isBefore(myBirthday));
        System.out.println("Harry älter: " + harryPottersBirthday.isAfter(myBirthday));
        System.out.println("Harry gleich alt: " + harryPottersBirthday.isEqual(myBirthday));
        //zu aufgabe d
        System.out.println("Wann werde ich 50: " + myBirthday.plusYears(50).toString());
        System.out.println("Welche Zeit: " + getMyTime());
        //zu LocalDateTime
        System.out.println(LocalDateTime.now());
        //30.Mai 2020 um 11:35
        LocalDateTime march = LocalDateTime.of(2020, 5, 30, 11, 35);
        //vergleich
        System.out.println("In zukunft: " + march.isAfter(LocalDateTime.now()));
        LocalDate marchDate = march.toLocalDate();
        System.out.println(marchDate);
        //formatieren
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formattedDateTime = now.format(formatter);
        System.out.println("ISO: " + formattedDateTime);
        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        formattedDateTime = now.format(formatter);
        System.out.println("Pattern: " + formattedDateTime);
        formatter = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.MEDIUM).withLocale(Locale.US);
        formattedDateTime = now.format(formatter);
        System.out.println("Locale: " + formattedDateTime);
        DateTimeFormatter fullformater = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        String dateString = "01. Mai 2023";
        //LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd. MMM yyyy"));
        //System.out.println(parsedDate);
        Set<String> allZones = new TreeSet<>(ZoneId.getAvailableZoneIds());
        allZones.forEach(System.out::println);
        ZonedDateTime leipzigDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Berlin"));
        System.out.println(leipzigDateTime);
        ZonedDateTime tokyoDateTime = leipzigDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoDateTime);
        //Zone verschieben Regeln
        ZoneRules rules = ZoneRulesProvider.getRules("Europe/Berlin", false);
        System.out.println("Zeitverschiebungsregeln nach der letzten aufgezeichneten historischen Zeitverschiebung in Leipzig: ");
        rules.getTransitionRules().forEach(System.out::println);
        rules.getTransitions().forEach(System.out::println);
        //Zeitspannen
        LocalDateTime firstDay = LocalDateTime.of(2023, 03, 25, 10 , 00, 00);
        Duration twentyfourHours = Duration.ofDays(1);
        Period oneDay = Period.of(0, 0, 1);
        System.out.println("24h später: " + firstDay.plus(twentyfourHours));
        System.out.println("1d später: " + firstDay.plus(oneDay));
        //Zeitspanne mit Zeitzonen
        ZonedDateTime zonedfirstDay = ZonedDateTime.of(firstDay, ZoneId.of("Europe/Berlin"));
        System.out.println("24h später: " + zonedfirstDay.plus(twentyfourHours));
        System.out.println("1d später: " + zonedfirstDay.plus(oneDay));


    }
    private static String getMyTime() {
        //Stunde Uhr, Minute Minuten und Sekunden Sekunden
        LocalTime jetzt = LocalTime.now();
        return jetzt.getHour() + " Uhr, " + jetzt.getMinute() + " Minuten und " + jetzt.getSecond() + " Sekunden";
    }
}
