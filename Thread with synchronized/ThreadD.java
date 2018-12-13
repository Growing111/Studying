
public class ThreadD extends Thread {
    private  Service service;

    public ThreadD(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.StopMethod();
    }
}
