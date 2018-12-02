

import org.springframework.cglib.proxy.Enhancer;


public class TestCGLBProxy {

    public static void main(String[] args) throws Exception {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Print.class);
        enhancer.setCallback(new CGLBProxy());
        Print print= (Print) enhancer.create();
        print.Display();
  }
}
