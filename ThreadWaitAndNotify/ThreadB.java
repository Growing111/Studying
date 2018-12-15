

public class ThreadB extends Thread {

    private Object object;

    public ThreadB(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object){
            System.out.println("notify开始，notify time="+System.currentTimeMillis());
            object.notify();
            System.out.println("notify结束，notify time="+System.currentTimeMillis());
        }
    }
}
