package Concurrency;

public class Semaphore {

  private int permits;

  public Semaphore(int permits) {
    this.permits = permits;
  }

  public synchronized void acquire() throws InterruptedException{

    while( permits <= 0 ){
      wait();
    }

    permits--;

  }

  public synchronized void release(){

    permits++;
    notify();
  }


  public static void main(String[] args){

    Semaphore semaphore = new Semaphore(3);
    Runnable runnable = () -> {
      try{
        semaphore.acquire();
        System.out.println("Thread Acquired " + Thread.currentThread().getName());
        Thread.sleep(1000); // Simulate some work

        System.out.println("Thread Released " + Thread.currentThread().getName());

      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } finally {
        semaphore.release();

      }
    };

    Thread thread1 = new Thread(runnable, "thread-1");
    Thread thread2 = new Thread(runnable,"thread-2");
    Thread thread3 = new Thread(runnable, "thread-3");
    Thread thread4 = new Thread(runnable, "thread-4");

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
  }
}
