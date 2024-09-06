package com.learn.java.DesignPatterns.SingletonPattern;

public class SingletonLazyImplementation {

  /**
   * The instance variable holds the single instance of the SingletonLazyImplementation class. It is
   * initialized lazily, meaning it is created only when it is needed for the first time.
   */
  public static SingletonLazyImplementation instance;

  /**
   * The private constructor ensures that the class cannot be instantiated from outside the class.
   */
  private SingletonLazyImplementation() {
  }

  /**
   * getInstance() method returns the instance of SingletonLazyImplementation. It checks if the
   * instance is null, and if so, creates a new instance. Subsequent calls to getInstance() will
   * return the already created instance.
   *
   * @return The instance of SingletonLazyImplementation.
   */
  public SingletonLazyImplementation getInstance() {
    if (instance == null) {
      instance = new SingletonLazyImplementation();
    }
    return instance;
  }
}
