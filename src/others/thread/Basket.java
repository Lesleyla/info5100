package others.thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Basket<T>{

    //    public ThreadSafeQueue(String initialList) {
    //        this.queue = new ArrayList<>(initialList);
    //    }
    //    public ThreadSafeQueue() {
    //        queue = new ArrayList<>();
    //    }
    //    public synchronized void add(T obj) {
    //        this.queue.add(T obj);
    //    }
    //
    //    public synchronized T remove() {
    //        return this.queue.remove();
    //    }
    //    public synchronized T peek() {
    //        return this.queue.peek();
    //    }
    //    //check if the queue is empty
    //    public boolean isEmpty() {
    //        return (queueSize == 0);
    //    }

    BlockingQueue<String> basket;

    public Basket() {
        basket = new LinkedBlockingQueue<String>();
    }

    // 生产苹果，放入篮子
    public void add(T data) throws InterruptedException {
        // put方法放入一个苹果，若basket满了，等到basket有位置
        basket.add("An apple");
    }

    // 消费苹果，从篮子中取走
    public String remove() throws InterruptedException {
        // take方法取出一个苹果，若basket为空，等到basket有苹果为止(获取并移除此队列的头部)
        return basket.remove();
    }

}
