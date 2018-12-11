
public class TestThreadB {
    public static void main(String[] args) throws InterruptedException {
        Student student=new Student();
        ThreadB thread=new ThreadB(student);
        thread.start();
        Thread.sleep(1000);
        student.getStudent();
    }
}
