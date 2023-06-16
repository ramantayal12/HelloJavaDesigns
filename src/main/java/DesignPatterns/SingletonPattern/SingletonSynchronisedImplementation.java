package DesignPatterns.SingletonPattern;

public class SingletonSynchronisedImplementation {

    /**
     * The instance variable holds the single instance of the SingletonSynchronisedImplementation class.
     * It is initialized lazily, meaning it is created only when it is needed for the first time.
     */
    public static SingletonSynchronisedImplementation instance;

    /**
     * The private constructor ensures that the class cannot be instantiated from outside the class.
     */
    private SingletonSynchronisedImplementation() {
    }

    /**
     * getInstance() method returns the instance of SingletonSynchronisedImplementation.
     * It checks if the instance is null, and if so, creates a new instance.
     * The method is synchronized to ensure thread safety and prevent multiple threads from creating separate instances simultaneously.
     * @return The instance of SingletonSynchronisedImplementation.
     */
    public synchronized SingletonSynchronisedImplementation getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronisedImplementation ();
        }
        return instance;
    }
}
