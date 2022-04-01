//package midterm.thread.v1;
//
//import java.util.concurrent.locks.ReentrantLock;
//import java.util.concurrent.locks.Condition;
//
//class queueue {
//    private ReentrantLock lock = new ReentrantLock();
//    private Condition full = lock.newCondition();
//    private Condition empty = lock.newCondition();
//    private int[] queue;
//    private int tail = 0;
//    private int head = 0;
//    private int size = 0;
//    public queueue(int capacity) {
//        queue = new int[capacity];
//    }
//
//    public void enqueue(int element) throws InterruptedException {
//        lock.lock();
//        try {
//            while(size == queue.length) {
//                full.await();
//            }
//            queue[tail++] = element;
//            tail %= queue.length;
//            size++;
//            empty.signal();
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public int dequeue() throws InterruptedException {
//        lock.lock();
//        try {
//            while(size == 0) {
//                empty.await();
//            }
//            int res = queue[head++];
//            head %= queue.length;
//            size--;
//            full.signal();
//            return res;
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public int size() throws InterruptedException {
//        lock.lock();
//        try {
//            return this.size;
//        } finally {
//            lock.unlock();
//        }
//    }
//}