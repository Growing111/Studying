

public class ThreadC extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("ThreadC线程中取值="+Tools.tools.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
