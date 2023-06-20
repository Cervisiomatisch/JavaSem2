package KlausurVorbereitung;

public class ZWÖLFThreadMaker {
    public static void  machImHintergrund(Runnable code) {
        Thread thread = new Thread(code);
        thread.start();
        //für nacheinander ausführen
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
