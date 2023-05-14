package nestedzeug.JavaCollections;

import java.util.*;
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> canteenQueue = new LinkedList<>();
        canteenQueue.add("Miss Marple");
        canteenQueue.add("Sherlock Holmes");
        canteenQueue.add("Hercule Poirot");
        System.out.println(canteenQueue);
        System.out.println("first person served: " + canteenQueue.remove());
        System.out.println("now head of the queue: " + canteenQueue.element());
        System.out.println("next person served: " + canteenQueue.poll());
        System.out.println("now head of queue: " + canteenQueue.peek());
        System.out.println("is Empty: " + canteenQueue.isEmpty());
        System.out.println("Size of waiting queue " + canteenQueue.size());
        System.out.println("final queue: " + canteenQueue);
    }
}
