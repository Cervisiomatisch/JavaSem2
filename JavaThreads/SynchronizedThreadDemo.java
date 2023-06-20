package JavaThreads;

public class SynchronizedThreadDemo {
    private static int counter = 0;
    public static synchronized void addToCounter(int tntVariable){
        counter += tntVariable;
    }
    public static synchronized void substractFromCounter(int tntVariable){
        counter -= tntVariable;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread addThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                addToCounter(3);
            }
        }, "addThread");
        Thread subThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                substractFromCounter(3);
            }
        }, "subThread");
        addThread.start();
        subThread.start();
        addThread.join();
        subThread.join();
        System.out.println(counter);
    }
}
