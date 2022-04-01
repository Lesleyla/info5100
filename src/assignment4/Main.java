package assignment4;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new BlockingQueue(10);
        BlockingQueue stringQueue = new BlockingQueue(3);
        System.out.println(queue);
        queue.add(3);
        queue.add(4);
        queue.add(6);
        queue.add(9);
        System.out.println("remove:" + queue.remove());
        System.out.println(queue.peek());
        System.out.println("remove:" + queue.remove());
        System.out.println(queue.peek());

        stringQueue.add("apple");
        stringQueue.add("orange");
        stringQueue.add("peach");
        System.out.println(stringQueue);
        while(!stringQueue.isEmpty()){
            System.out.println(stringQueue.remove());
        }

    }
}
