package DateandTime;
import java.time.LocalDate;
public class LocalTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate harryPottersBirthday = LocalDate.of(1980, 7, 31); LocalDate garfieldsBirthday = LocalDate.of(1978, 6, 19);
        LocalDate bewitchedHarrysBirthday =
                harryPottersBirthday.minusYears(2);
        System.out.println("Wochentag von Harry Geburtstag: " + harryPottersBirthday.getDayOfWeek());
        System.out.println("Verzauberter Geburtstag: " + bewitchedHarrysBirthday);
        System.out.println("Garfields Geburtsjahr: " + garfieldsBirthday.getYear());
    } }
