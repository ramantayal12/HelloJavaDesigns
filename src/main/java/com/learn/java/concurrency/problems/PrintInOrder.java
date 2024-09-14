package com.learn.java.concurrency.problems;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.units.qual.A;

/**
 * Suppose we have a class:
 * <p>
 * public class Foo{
 *    public void first() { print("first"); }
 *    public void second() { print("second"); }
 *    public void third() { print("third"); }
 * }
 * </p>
 *
 * <p>
 * The same instance of Foo will be
 * passed to three different threads. Thread A will call first(), thread B will call second(), and
 * thread C will call third(). Design a mechanism and modify the program to ensure that second() is
 * executed after first(), and third() is executed after second().
 */

class First extends Thread {
  Foo foo;

  public First(Foo foo) {
    this.foo = foo;
  }

  @Override
  public void run() {
    try {
      foo.first(() -> System.out.println("first"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

class Second extends Thread {
  Foo foo;

  public Second(Foo foo) {
    this.foo = foo;
  }

  @Override
  public void run() {
    try {
      foo.second(() -> System.out.println("second"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

class Third extends Thread {
  Foo foo;

  public Third(Foo foo) {
    this.foo = foo;
  }

  @Override
  public void run() {
    try {
      foo.third(() -> System.out.println("third"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

class Foo{

  private AtomicInteger step;

  public Foo() {
    this.step = new AtomicInteger(1);
  }

  public void first(Runnable first) throws InterruptedException{

    while(step.compareAndSet(1, 2)){
      wait();
    }
    first.run();
    notifyAll();
  }

  public void second(Runnable second) throws InterruptedException {

    while(step.compareAndSet(2, 3)){
      wait();
    }
    second.run();
    notifyAll();
  }

  public void third(Runnable third) throws InterruptedException {

    while (step.compareAndSet(3, 1)){
      wait();
    }
    third.run();
  }
}

class Foo1 {

  private final CyclicBarrier barrier1;
  private final CyclicBarrier barrier2;

  public Foo1() {
    barrier1 = new CyclicBarrier(2);
    barrier2 = new CyclicBarrier(2);
  }

  public void first(Runnable printFirst) throws InterruptedException {

    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    try {
      barrier1.await();
    } catch (BrokenBarrierException e) {
      e.printStackTrace();
    }

  }

  public void second(Runnable printSecond) throws InterruptedException {

    try {
      barrier1.await();
      // printSecond.run() outputs "second". Do not change or remove this line.
      printSecond.run();
      barrier2.await();
    } catch (BrokenBarrierException e) {
      e.printStackTrace();
    }
  }

  public void third(Runnable printThird) throws InterruptedException {
    try {
      barrier2.await();
      // printThird.run() outputs "third". Do not change or remove this line.
      printThird.run();
    } catch (BrokenBarrierException e) {
      e.printStackTrace();
    }

  }
}

public class PrintInOrder {

  public static void main(String[] args){

    Foo foo = new Foo();

    ExecutorService pool = Executors.newFixedThreadPool(30);

    for(int i=0; i<10000; i++){
      Thread first = new First(foo);
      Thread second = new Second(foo);
      Thread third = new Third(foo);

      pool.submit(first);
      pool.submit(second);
      pool.submit(third);

    }

    pool.shutdown();
  }

}
