package com.learn.java.concurrency.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DemoRunnableObject extends Thread {

  public DemoRunnableObject(int i) {
    this.setName(String.valueOf(i));
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " executing");
  }

}

public class ThreadPoolDemo {

  /**
   * this spawns 1000 threads
   */
  public static void newThreadEveryOperation() {
    for (int i = 0; i < 1000; i++) {
      new DemoRunnableObject(i).start();
    }

  }

  /**
   * Use same 10 threads in pool for executing all 1000 tasks
   */
  public static void threadPoolMethod() {

    ExecutorService pool = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 1000; i++) {
      pool.submit(new DemoRunnableObject(i));
    }
    pool.shutdown();

  }

  public static void main(String[] args) {
    newThreadEveryOperation();
    System.out.println("Executor Pool Method");
    threadPoolMethod();
  }
}
