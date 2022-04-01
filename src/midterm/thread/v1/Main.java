package midterm.thread.v1;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BoundedBlockingQueue queue = new BoundedBlockingQueue(5);
        System.out.println(queue);
        queue.enqueue(1);
        queue.enqueue(1);
        System.out.println(queue.size());
        queue.enqueue(1);
        queue.enqueue(1);
        System.out.println(queue.size());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.size());
        queue.enqueue(0);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
    }
}
