package JavaThreads;

public class ThreadWithResource {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread aThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                counter ++;
            }
        }, "aThread");
        Thread anotherThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                counter ++;
            }
        }, "anotherTread");
        aThread.start();
        anotherThread.start();
        try {
        aThread.join();
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        try {
            anotherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
