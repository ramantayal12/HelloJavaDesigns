package com.learn.java.DesignPatterns.SingletonPattern;

public class SingletonEagerImplementation {

  /**
   * The instance variable holds the single instance of the SingletonEagerImplementation class. It
   * is initialized eagerly, meaning it is created at the time of class loading.
   */
  public static SingletonEagerImplementation instance = new SingletonEagerImplementation();

  /**
   * The private constructor ensures that the class cannot be instantiated from outside the class.
   */
  private SingletonEagerImplementation() {
  }

  /**
   * getInstance() method returns the instance of SingletonEagerImplementation. Since the instance
   * is already created eagerly, this method simply returns the instance variable.
   *
   * @return The instance of SingletonEagerImplementation.
   */
  public SingletonEagerImplementation getInstance() {
    return instance;
  }
}
