package nestedzeug.timeBeispiel;

import java.time.format.DateTimeFormatter;

public class TestClass {
    public static void main(String[] args) {
        TimeClient alienTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + alienTimeClient.toString());
        System.out.println("Current time in UTC: " + alienTimeClient.getZonedDateTime("Europe/Berlin"). format(DateTimeFormatter.ISO_INSTANT));
        System.out.println("Time with Japanese Time Zone: " +
                alienTimeClient.getZonedDateTime("Japan")); System.out.println("Japanese Time in UTC: " +
                alienTimeClient.getZonedDateTime("Japan").format(DateTimeFormatter.ISO_INSTANT));
        System.out.println(alienTimeClient.getCountDownMessage());
    }
}
