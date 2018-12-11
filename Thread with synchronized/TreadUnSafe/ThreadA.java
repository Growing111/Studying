

public class ThreadA extends Thread {
    private Count count;

    public ThreadA(Count count) {
       this.count=count;
    }

    @Override
    public void run() {
        synchronized (count) {
            System.out.println(Thread.currentThread().getName() + " print ");
            count.print();
        }
    }
}
