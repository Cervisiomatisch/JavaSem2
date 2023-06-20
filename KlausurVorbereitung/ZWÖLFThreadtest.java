package KlausurVorbereitung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZWÖLFThreadtest {

    public static void main(String[] args) {
        ZWÖLFThread dings = new ZWÖLFThread();
        dings.start();
        ZWÖLFRunnable runnable = new ZWÖLFRunnable();
        Thread dingsbums = new Thread(runnable);
        dingsbums.start();
        //Mit threadMaker - Liste im Hintergrund befüllen
        Map<Character, Integer> meineListe = new HashMap<>();
        ZWÖLFThreadMaker.machImHintergrund(() -> {
            int value = 0;
            for (char i = 'a'; i <= 'z'; i++ ){
                meineListe.put(i, value);
                value ++;
            }
        });
        ZWÖLFThreadMaker.machImHintergrund(() -> {
            System.out.println("Liste wurde befüllt:");
            meineListe.forEach((character, integer) -> System.out.println("Hund: " + character + ", ID: " + integer));
        });
    }
}
