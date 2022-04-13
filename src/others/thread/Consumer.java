package others.thread;

public class Consumer implements Runnable {
    private String instance;
    private Basket basket;

    public Consumer(String instance, Basket basket) {
        this.instance = instance;
        this.basket = basket;
    }

    public void run() {
        try {
            while (true) {
                // 消费苹果
                System.out.println(basket.remove());

                // 休眠1000ms
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Consumer Interrupted");
        }
    }
}
