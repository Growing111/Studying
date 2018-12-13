

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        ThreadC threadC=new ThreadC(service);
        threadC.start();
        Thread.sleep(1000);
        ThreadD threadD=new ThreadD(service);
        threadD.start();
        System.out.println("已经发起停止命令!");
    }
}
