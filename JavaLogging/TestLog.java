package JavaLogging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLog {
    private static final Logger logger = Logger.getLogger(TestLog.class.getName());

    public static void main(String[] args) throws IOException {

        logger.fine("fürs Protokoll: eine \"tracing\" Information");
        logger.info("fürs Protokoll: eine Information");
        logger.warning("fürs Protokoll: eine Warnung");
        logger.severe("fürs Protokoll: ein schwerwiegendes Problem");

        // wir konfigurieren einen „Handler“
        FileHandler fileHandler; // für Dateiausgabe; gibt auch andere
        try {
        fileHandler = new FileHandler("log.txt");
        // wir konfigurieren für diesen „Handler“ eine (simple) Formatangabe
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler); }
        catch (Exception e) {
        } // eigentlich viel Arbeit hier
        // wir konfigurieren für den Logger eine „Filter“-Angabe
        //logger.setLevel(Level.INFO);
        logger.setLevel(Level.FINE);
        //Stummschalten von root-Logger
        /*
        Logger rootLogger = Logger.getLogger("meinRootLogger");
        rootLogger.setLevel(Level.FINE);
        rootLogger.getHandlers()[0].setLevel(Level.OFF);
         */
        //Nur noch Warning-Level anzeigen
        try{
            fileHandler = new FileHandler(("log.txt"));
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.WARNING);
        } catch (IOException | SecurityException e) {
            throw new RuntimeException(e);
        }


    }
}

