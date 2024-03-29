package one.digital.innovation.gof.singleton;

public class SingletonLazyHolder {
    public static  class InstanceHolder {
        private static SingletonLazyHolder instancia  = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}

