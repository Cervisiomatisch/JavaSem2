package DateandTime;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class KlausurUbung {
    public static void main(String[] args) {
        //Bestimmen Sie das aktuelle Datum und initialisieren Sie eine Variable damit.
        LocalDate today = LocalDate.now();
        //Auch der Weihnachtsmann ist zur Umsatzsteuervoranmeldung verpflichtet.
        // Um sich für die Frist nicht mit irgendwelchen Feiertagen auseinandersetzen zu müssen, hat er für sich intern festgelegt,
        // dass er die Anmeldung jeweils bis zum 10. eines Monats fertig haben muss. Bestimmen Sie ausgehend von dem aktuellen Datum aus
        // a), an welchem Tag der Weihnachtsmann seine Umsatzsteuervoranmeldung fertig haben möchte.
        LocalDate abgabe = today.withDayOfMonth(10).plusMonths((today.getDayOfMonth() > 10) ? 1 : 0);
        System.out.println("Fälligkeitsdatum: " + abgabe);

        //Nach dem ganzen Steuerstress freut sich der Weihnachtsmann auf Weihnachten und möchte gern wissen, auf welchen Wochentag
        //Weihnachten dieses Jahr (wobei der Weihnachtsmann nicht jedes Jahr den Quellcode ändern möchte) fällt.
        LocalDate christmas = LocalDate.of(today.getYear(), 12, 24);
        System.out.println(christmas.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));

    }
}
