

public class TestThreadA {
    public static void main(String[] args) {
        Count count=new Count();
        ThreadA a=new ThreadA(count);
        ThreadA b=new ThreadA(count);
        a.start();
        b.start();
    }
}
