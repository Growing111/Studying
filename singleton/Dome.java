
public class Dome {
//      饿汉
//    private static Dome dome =new Dome();
//
//    private Dome(){}
//
//    public static Dome getDome(){
//        return dome;
//    }

        //懒汉
//    private static volatile Dome dome=null;
//
//    private Dome(){}
//
//    public static Dome getDome(){
//        if(dome==null){
//            synchronized (Dome.class){
//                if(dome==null){
//                    dome=new Dome();
//                }
//            }
//        }
//        return dome;
//    }

    //静态内部类
    private Dome(){}

    private static class DomeHoler{
        private static Dome indome = new Dome();
    }

    public static Dome getDome(){
        return DomeHoler.indome;
    }
}
