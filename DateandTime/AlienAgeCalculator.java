package DateandTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class AlienAgeCalculator {

    public static String calculateAgeInHumanYears(String bday) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //Checken ob im Pattern liegt und ob Jahr < 1
        LocalDate zeroYear= LocalDate.of(0001, 01, 01);
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
        return "Das Alien ist " + age.toString();
    }

    public static void main(String[] args) {
        System.out.println(calculateAgeInHumanYears("01.03.2002"));
    }
}
