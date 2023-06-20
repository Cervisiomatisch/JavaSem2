package JavaThreads;

public class ThreadRunnable extends Thread implements Runnable {
    public ThreadRunnable(String name){
        super(name);
    }
    @Override
    public void run() {
        for(char alphabet = 'a'; alphabet <='z'; alphabet ++ ){
            System.out.println("Thread mit Alphabet: " + alphabet);
        }
    }
}
