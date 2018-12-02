

public class TestJDKProxy {

    public static void main(String[] args) throws Throwable {
        JDKProxy jdkProxy=new JDKProxy(new PrintServiceImpl());
        Object obj=jdkProxy.invoke(PrintServiceImpl.class,PrintServiceImpl.class.getMethod("Print"),args);
    }
}
