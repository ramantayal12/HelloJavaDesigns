package com.learn.java.Concurrency.datarace;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataRacePreventThread extends Thread {

  public static int cntr = 0;

  /**
   * <p>
   * to prevent data race condition we can use locks
   * The issue here arises from the fact that the ReentrantLock instance is not shared across
   * multiple threads. In your implementation, each thread has its own ReentrantLock, so they're
   * locking independently, which defeats the purpose of using the lock to prevent a data race.
   * </p>
   * <p>
   * @ Lock reentrantLock = new ReentrantLock();
   * </p>
   */


  // Make the Lock static so all threads share the same lock
  public static Lock reentrantLock = new ReentrantLock();

  @Override
  public void run() {

    for (int i = 0; i < 10000; i++) {
      reentrantLock.lock();
      cntr++;
      reentrantLock.unlock();

    }

  }

}
