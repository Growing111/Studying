
public class Test {

    public static void main(String[] args) {
        Object object=new Object();
        ThreadA threadA=new ThreadA(object);
        threadA.start();
        ThreadB threadB=new ThreadB(object);
        threadB.start();
    }
}
