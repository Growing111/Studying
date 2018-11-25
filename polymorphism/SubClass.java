

public class SubClass extends SuperClass {

    public void run(){
        System.out.println("SubClass Overrides run methods");
    }

    public static void main(String[] args) {
        SuperClass superClass=new SuperClass();
        superClass.run();
        superClass=new SubClass();
        superClass.run();
    }
}
