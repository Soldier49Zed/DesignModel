package Singleton;

/**
 * @Author: Soldier49Zed
 * @Date: 2019/9/4
 * @Description:
 */


//使用DCL实现单例模式
/*public class Singleton {
    public static volatile Singleton singleton = null;

    private Singleton(){

    }

    //双重检查加锁，只有在第一次实例化的时候，才会启用同步机制，提高了性能
    public Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}*/


// 使用静态内部类实现单例模式
// 延迟加载  线程池安全
public class Singleton{

   private Singleton(){}


   //静态类在使用的时候才会加载，而且只加载一次
   public static class T{
       private static Singleton singleton = new Singleton();
   }

   private static Singleton getSingleton(){
       return T.singleton;
   }
}