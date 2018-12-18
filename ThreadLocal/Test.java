

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadC threadC=new ThreadC();
        threadC.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("在Mian线程中取值="+Tools.tools.get());
            Thread.sleep(2000);
        }
    }
}
