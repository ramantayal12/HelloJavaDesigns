package com.learn.java.concurrency;

public class ThreadBasics extends Thread {

  /**
   * Adding volatile keyword is important here, which ensures that changes to counting variable are
   * visible to all threads immediately. The volatile keyword ensures that every read and write to
   * this variable happens directly from memory rather than from the CPU cache.
   */
  public static volatile boolean counting = true;
  public int cntr = 0;

  @Override
  public void run() {
    while (counting) {
      cntr++;
    }
    System.out.println(cntr);
  }

  public int getCounter() {
    return cntr;
  }

}
