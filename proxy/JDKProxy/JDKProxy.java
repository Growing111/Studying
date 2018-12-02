
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler{

    private Object target;

    public JDKProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //利用反射调用代理的方法
        Object result=method.invoke(target,args);

        return result;
    }
}
