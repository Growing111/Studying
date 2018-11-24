
public class Demo {
    public void add(int a){
        System.out.println(5+a);
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
    //这样写上面的add(int a,int b)方法会报错
   //public int add(int a,int b){}       //与返回值无关的
    //protected void add(int a,int b){}  //与修饰符无关

    public int add(int c,double b){
        return (int) (c+b);

    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.add(2);
        demo.add(3,5);
        System.out.println(demo.add(5,3.0));
    }
}
