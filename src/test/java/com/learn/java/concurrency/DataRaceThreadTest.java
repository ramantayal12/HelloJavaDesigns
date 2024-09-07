package com.learn.java.concurrency;

import com.learn.java.concurrency.datarace.DataRacePreventThread;
import com.learn.java.concurrency.datarace.DataRacePreventionSynchronized;
import com.learn.java.concurrency.datarace.DataRaceThread;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataRaceThreadTest {

  private DataRaceThread thread1;
  private DataRaceThread thread2;

  private DataRacePreventThread preventThread1;
  private DataRacePreventThread preventThread2;

  private DataRacePreventionSynchronized preventionSynchronized1;
  private DataRacePreventionSynchronized preventionSynchronized2;
  @BeforeEach
  void setUp(){
    thread1 = new DataRaceThread();
    thread2 = new DataRaceThread();

    preventThread1 = new DataRacePreventThread();
    preventThread2 = new DataRacePreventThread();

    preventionSynchronized1 = new DataRacePreventionSynchronized();
    preventionSynchronized2 = new DataRacePreventionSynchronized();
  }

  @Test
  public void testDataRaceCondition() throws InterruptedException {

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    // so cntr is getting by 1000 times by each, but data race occurs and it is not 2000, as thread1 might read it 555 and increment it but thread2 also read it 555
    System.out.println(DataRaceThread.cntr);
  }

  @Test
  public void testPreventDataRaceCondition() throws InterruptedException {

    preventThread1.start();
    preventThread2.start();

    preventThread1.join();
    preventThread2.join();

    // cntr will be addition of two since we used lock(mutex)
    System.out.println(DataRacePreventThread.cntr);
  }

  @Test
  public void testPreventDataRaceCondition_UsingSynchronizedMethod() throws InterruptedException {

    preventionSynchronized1.start();
    preventionSynchronized2.start();

    preventionSynchronized1.join();
    preventionSynchronized2.join();

    // cntr will be addition of two since we used lock(mutex)
    System.out.println(DataRacePreventionSynchronized.cntr);
  }

}