

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();

    public  void Read(){
        try {
            lock.readLock().lock();
            System.out.println("获取读锁"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }
    }

    public void Write() {
        try {
            lock.writeLock().lock();
            System.out.println("获取写锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
