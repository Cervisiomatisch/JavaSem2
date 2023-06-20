package DateandTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;


public class AlienAgeCalculator {

    public static String calculateAgeInHumanYears(String bday) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //Checken ob im Pattern liegt und ob Jahr < 1
        LocalDate zeroYear= LocalDate.of(1, 1, 1);
        LocalDate parsedBDay = null;
        try{
            parsedBDay = LocalDate.parse(bday, pattern);
            if (parsedBDay.isBefore(zeroYear)) {
                return "invalider Geburtstag!";
            }
        } catch (Exception e) {
            return "invalider Geburtstag!";
        }
        Period age = Period.between(parsedBDay, LocalDate.now()).multipliedBy(2);
        return "Das Alien ist " + age.getYears() + " Jahre, " + age.getMonths() + " Monate und " + age.getDays() + " Tage.";
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Gebe Geburtstag in dd.mm.yyyy ein: ");
        String date = scnr.next();
        System.out.println(calculateAgeInHumanYears(date));
    }
}
