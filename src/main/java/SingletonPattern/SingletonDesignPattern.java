package SingletonPattern;

class SingletonEagerImplementation{

    public static SingletonEagerImplementation instance = new SingletonEagerImplementation ();

    private SingletonEagerImplementation() {}

    public SingletonEagerImplementation getInstance(){
        return instance;
    }
}

class SingletonLazyImplementation{

    public static SingletonLazyImplementation instance;

    private SingletonLazyImplementation() {}

    public SingletonLazyImplementation getInstance(){
        if( instance == null ){
            instance = new SingletonLazyImplementation ();
        }
        return instance;
    }
}

class SingletonSynchronisedImplementation{

    public static SingletonSynchronisedImplementation instance;

    private SingletonSynchronisedImplementation() {}

    public synchronized SingletonSynchronisedImplementation getInstance(){
        if( instance == null ){
            instance = new SingletonSynchronisedImplementation ();
        }
        return instance;
    }
}

public class SingletonDesignPattern {

}
