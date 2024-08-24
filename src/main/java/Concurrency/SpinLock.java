package Concurrency;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * A spinlock is a type of lock where the thread attempting to acquire the lock does not immediately
 * block if the lock is not available. Instead, it continuously checks (or "spins") until the lock
 * becomes available.
 */
public class SpinLock {

  private final AtomicBoolean isLocked = new AtomicBoolean(false);

  public void lock() {

    while( !isLocked.compareAndSet(false, true)){
      // Busy-wait (spinning) until the lock is acquired
    }
  }

  public void unlock(){
    isLocked.set(false);
  }

  public static void main(String[] args) {
    SpinLock spinLock = new SpinLock();

    // Task to be executed by multiple threads
    Runnable task = () -> {
      try {
        // Acquire the spinlock
        spinLock.lock();
        System.out.println(Thread.currentThread().getName() + " acquired the lock.");
        // Simulate some work
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " released the lock.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        // Release the spinlock
        spinLock.unlock();
      }
    };

    // Creating multiple threads that will attempt to acquire the lock
    Thread t1 = new Thread(task, "Thread-1");
    Thread t2 = new Thread(task, "Thread-2");

    // Starting the threads
    t1.start();
    t2.start();
  }
}
