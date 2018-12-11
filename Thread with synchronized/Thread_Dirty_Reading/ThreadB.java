

public class ThreadB extends Thread {
    private Student student;

    public ThreadB(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        try {
            student.setStudent("李四","222");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
