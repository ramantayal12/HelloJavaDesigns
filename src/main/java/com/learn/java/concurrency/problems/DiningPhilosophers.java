package com.learn.java.concurrency.problems;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {

  public static int food = 1000;

  static class Philosopher implements Runnable {

    private final int id;
    private final Lock leftFork, rightFork;
    final Object foodLock = new Object();

    public Philosopher(int id, Lock leftFork, Lock rightFork) {
      this.id = id;
      this.leftFork = leftFork;
      this.rightFork = rightFork;
    }

    private void think() throws InterruptedException {
      System.out.println("Philosopher " + id + " is thinking.");
      Thread.sleep((int) (Math.random() * 1000));
    }

    private synchronized void eat() throws InterruptedException {
      if( food > 0 ) {
        food--;
        System.out.println("Food Left : " + food + " ,Philosopher " + id + " is eating.");
        Thread.sleep((int) (Math.random() * 1000));
      }
    }

    private void eat2() throws InterruptedException {
      synchronized (foodLock) {
        if( food > 0 ) {
          food--;
          System.out.println("Food Left : " + food + " ,Philosopher " + id + " is eating.");
        }

      }
      Thread.sleep((int) (Math.random() * 1000));
    }

    @Override
    public void run() {
      try {
        while (food > 0) {
          think();
          if (leftFork.tryLock()) {
            try {
              if (rightFork.tryLock()) {
                try {
                  eat2();
                } finally {
                  rightFork.unlock();
                }
              }
            } finally {
              leftFork.unlock();
            }
          }
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public static void main(String[] args) {
    final int NUM_PHILOSOPHERS = 5000;
    Lock[] forks = new ReentrantLock[NUM_PHILOSOPHERS];

    for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
      forks[i] = new ReentrantLock();
    }

    Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];
    Thread[] threads = new Thread[NUM_PHILOSOPHERS];

    for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
      Lock leftFork = forks[i];
      Lock rightFork = forks[(i + 1) % NUM_PHILOSOPHERS];
      philosophers[i] = new Philosopher(i, leftFork, rightFork);
      threads[i] = new Thread(philosophers[i], "Philosopher " + i);
      threads[i].start();
    }
  }
}

