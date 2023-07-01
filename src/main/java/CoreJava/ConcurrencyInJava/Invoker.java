package CoreJava.ConcurrencyInJava;

public class Invoker {

  public static void main(String[] args) throws InterruptedException {

    // Method to get name of thread
    System.out.println (Thread.currentThread().getName());

    // Method to check if a thread is daemon or not.
    System.out.println (Thread.currentThread().isDaemon());

    // creating a daemon thread
    Thread thread = new Thread();
    thread.setDaemon(true);


    // Numbers will print in random order each time
    // as threads are executing in parallel
    // for threads to get their real multi threading behaviour
    // they should be called using start()
    for(int i=0; i<3; i++ ) {
      FirstThread firstThread = new FirstThread ();
      firstThread.start();
    }

    // another way of implementing a thread
    MyRunnable myRunnable = new MyRunnable();
    Thread runnableThread = new Thread(myRunnable);

    // sleep() method in a thread
    // direct use is on main() thread
    Thread.sleep (2000);
  }

}
