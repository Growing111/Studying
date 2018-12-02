
public class TestJDKProxy {

     public static void main(String[] args) throws Throwable {
        //目标对象
        PrintService printServiceImpl=new PrintServiceImpl();
        //把目标对象传给代理对象,建立代理关系
        InvocationHandler handler=new JDKProxy(printServiceImpl);
        //创建代理类的实例
        PrintService printService= (PrintService) Proxy.newProxyInstance(printServiceImpl.getClass().getClassLoader(),printServiceImpl.getClass().getInterfaces(),handler);
        printService.Print();
    }
}
