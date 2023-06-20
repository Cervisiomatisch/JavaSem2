package JavaThreads;

public class ThreadVererbung extends Thread{

    public ThreadVererbung(String name){
        super(name);
    }
    public void run(){
        for (int i = 1; i <= 26; i++){
            System.out.println("Thread mit Vererbung: " + i);
        }
    }
}
