package com.learn.java.Concurrency;

public class Mutex {

  private boolean isLocked;

  // Method to acquire the lock
  public synchronized void lock() throws InterruptedException {

    // Wait until the mutex is unlocked
    while (isLocked) {
      wait();
    }

    // Lock the mutex
    isLocked = true;

  }

  // Method to release the lock
  public synchronized void unlock() {

    // Unlock the mutex
    isLocked = false;

    // Notify a waiting thread that the mutex is now available
    notify();

  }

  // Driver method
  public static void main(String[] args) {
    Mutex mutex = new Mutex();

    // Task to be executed by multiple threads
    Runnable task = () -> {
      try {
        // Acquire the lock
        mutex.lock();
        System.out.println(Thread.currentThread().getName() + " acquired the lock.");
        // Simulate some work
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " released the lock.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        // Release the lock
        mutex.unlock();
      }
    };

    // Creating two threads that will attempt to acquire the lock
    Thread t1 = new Thread(task, "Thread-1");
    Thread t2 = new Thread(task, "Thread-2");

    // Starting the threads
    t1.start();
    t2.start();
  }
}
