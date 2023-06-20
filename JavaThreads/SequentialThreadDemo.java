package JavaThreads;

public class SequentialThreadDemo {
    private static int counter = 0;
    public static void addToCounter(int tntVariable){
        counter += tntVariable;
    }
    public static void substractFromCounter(int tntVariable){
        counter -= tntVariable;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread addThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                addToCounter(2);
            }
        }, "addThread");
        Thread subThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                substractFromCounter(2);
            }
        }, "subThread");
        addThread.start();
        addThread.join();
        subThread.start();
        subThread.join();
        System.out.println(counter);
    }
}
