package Day1;

import org.omg.PortableInterceptor.INACTIVE;

public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton INSTANCE = null;

    public synchronized static LazySingleton getInstance(){  //synchronized- zabezpiecza przed utworzeniem obiektu przez wiele wątków na raz

        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }

        return INSTANCE;
    }
}

class LazySingleton_v2{
    private LazySingleton_v2(){}
    private static class LazyHolder{
        static final LazySingleton_v2 INSTANCE = new LazySingleton_v2();
    }
    public static LazySingleton_v2 getInstance(){
        return LazyHolder.INSTANCE;
    }
}