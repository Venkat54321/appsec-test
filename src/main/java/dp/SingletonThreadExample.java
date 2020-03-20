package dp;

public class SingletonThreadExample {

    private static SingletonThreadExample instance;

    public static SingletonThreadExample getInstance(){
        if(instance == null){
            synchronized (SingletonThreadExample.class){
                if(instance == null){
                    instance = new SingletonThreadExample();
                }
            }
        }
        return instance;
    }
}
