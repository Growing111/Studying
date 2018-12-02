
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

   //为了方便就不另写一个类定义客户端了
    public static void main(String[] args) {
	    //创建目标对象
	    PrintService printService=new PrintServiceImpl();
	    //代理对象,把目标对象传给代理对象,建立代理关系
        PrintService printService= new StaticProxy(printService);
        printService.Print();
    }
}
