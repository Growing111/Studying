
public class Override {
    public void print(){
        System.out.println("Hello Override");
    }
    public void testException() throws IndexOutOfBoundsException{
        System.out.println("11");
    }
    public final void count (int a,int b) {
        System.out.println(a+b);
    }
    public Override(){}
}

class OverrideDemo extends Override{
    @java.lang.Override
    public void print() {
        System.out.println("print Hello of Override methods");
    }

    public final void count(int a,int b){}   //final修饰方法不能重新不然报错

    @java.lang.Override
    public void testException() throws Exception {    //异常不能比被重新方法广泛不然报错
        super.testException();
    }

}
