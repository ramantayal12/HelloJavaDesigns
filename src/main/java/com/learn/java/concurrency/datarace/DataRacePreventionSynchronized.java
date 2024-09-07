package com.learn.java.concurrency.datarace;

public class DataRacePreventionSynchronized extends Thread {

  public static int cntr = 0;

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      incrementCounter();
    }
  }

  /**
   * Synchronize at the class level by marking the method static so that it synchronizes on the
   * class object (ensuring that all threads are synchronizing on the same monitor).
   */
  public static synchronized void incrementCounter() {
    cntr++;
  }

}
