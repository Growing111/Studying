

public class ThreadA extends Thread{
    private Object object;

    public ThreadA(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object){
            System.out.println("wait开始，wait time="+System.currentTimeMillis());
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait结束，wait time="+System.currentTimeMillis());
        }
    }
}
