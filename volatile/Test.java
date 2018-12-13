

public class Test {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread=new RunThread();
        runThread.start();
        Thread.sleep(1000);
        runThread.setRunning(false);
        System.out.println("已经赋值false");
    }
}
