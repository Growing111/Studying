package cn.com.proxy;

//代理类
public class StaticProxy implements PrintService{

    private PrintService printService;

    public StaticProxy(PrintService printService) {
        this.printService = printService;
    }

    public void Print() {
        //代理类调用原对象的方法
        printService.Print();
        this.check();
    }

    public void check(){
        System.out.println("代理的额外操作");
    }

    public static void main(String[] args) {
        PrintService printService= new StaticProxy(new PrintServiceImpl());
        printService.Print();
    }
}
