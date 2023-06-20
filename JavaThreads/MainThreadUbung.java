package JavaThreads;

public class MainThreadUbung {
    public static void main(String[] args) throws InterruptedException {
        Thread threadZahlen = new ThreadVererbung("threadZahlen");
        Thread threadAlpha = new ThreadRunnable("threadAlpha");
        threadZahlen.start();
        threadZahlen.join();
        threadAlpha.start();
        threadAlpha.join();
    }
}
