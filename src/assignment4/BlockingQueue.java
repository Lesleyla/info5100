package assignment4;
import java.util.*;

public class BlockingQueue<T> {
    private Queue<T> queue;
    private int capacity;

    // Constructor
    public BlockingQueue(int capacity) {
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    // Add the given element to the end of the queue,
    // Waiting if necessary for space to become available
    public synchronized void add(T data) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(data);
        notifyAll();

    }

    // Retrive and remove the head of the queue,
    // waiting if no elements are present
    public synchronized T remove() throws InterruptedException {
        while (queue.size() == 0) {
            wait();
        }

        T res = queue.poll();
        notifyAll();

        return res;
    }

    public synchronized T peek() throws InterruptedException {
        T res = queue.peek();
        return res;
    }

    public synchronized Boolean isEmpty() throws InterruptedException {
        return queue.peek() == null;
    }
}