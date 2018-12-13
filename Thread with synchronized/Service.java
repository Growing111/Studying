
public class Service {
    private  boolean isContinueRun = true;

    public void RunMethod(){
        String str=new String();
        while (isContinueRun == true){
                synchronized (str){

                }
        }
        System.out.println("停下来！");
    }

    public void StopMethod(){
        isContinueRun=false;
    }
}
