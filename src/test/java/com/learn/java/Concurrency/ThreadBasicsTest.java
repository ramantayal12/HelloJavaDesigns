package com.learn.java.Concurrency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThreadBasicsTest {

  private Thread thread1;
  private Thread thread2;

  @BeforeEach
  void setUp() {

    thread1 = new ThreadBasics();
    thread2 = new ThreadBasics();

  }

  @Test
  public void testThreadWorking() throws InterruptedException {
    thread1.start();
    thread2.start();

    Thread.sleep(1000);

    ThreadBasics.counting = false;

    thread1.join();
    thread2.join();
  }

}