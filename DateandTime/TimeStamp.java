package DateandTime;

import java.time.Duration;
import java.time.Instant;

public class TimeStamp {
    public static void main(String[] args) {
       Instant start = Instant.now();
        int total = 0;
        for (int zahl = 1; zahl < 500000; zahl++){
            total += zahl;
        }
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toNanos());
    }
}
