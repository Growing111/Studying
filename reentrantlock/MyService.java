

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();

    public void testMethods(){
        lock.lock();
        for (int i = 0; i <10 ; i++) {
            System.out.println("ThreadName="+Thread.currentThread().getName()+" "+(i+1));
        }
        lock.unlock();
    }
}
