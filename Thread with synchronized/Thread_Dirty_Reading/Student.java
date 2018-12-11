
public class Student {
    private String username="张三";
    private String password="111";

    synchronized  public void setStudent(String username, String password) throws InterruptedException {
        this.username = username;
        Thread.sleep(2000);
        this.password = password;
        System.out.println("setStudent methods use"+Thread.currentThread().getName()+",print username="+username+",password="+password);
    }

    synchronized public void getStudent(){
        System.out.println(Thread.currentThread().getName()+": username="+username+",password="+password);
    }

}
