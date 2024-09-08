package com.learn.java.concurrency.problems;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class SoupProducer extends Thread {

  private final BlockingQueue<String> blockingQueue;
  private final int NUM_OF_CONSUMERS;

  public SoupProducer(BlockingQueue<String> blockingQueue, int numOfConsumers) {
    this.blockingQueue = blockingQueue;
    NUM_OF_CONSUMERS = numOfConsumers;
  }

  @Override
  public void run() {

    for (int i = 0; i < 20; i++) {
      try {
        System.out.println("Producing Soup : " + i);
        blockingQueue.add("soup number : " + i);

        // producer is faster than consumer here
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    for(int i=0; i<NUM_OF_CONSUMERS; i++) {
      blockingQueue.add("no soup");
    }
  }

}

class SoupConsumer extends Thread {

  private final BlockingQueue<String> blockingQueue;

  public SoupConsumer(BlockingQueue<String> blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {
    while (true) {
      try {
        String take = blockingQueue.take();
        System.out.println(take);

        if(take.equals("no soup")) break;
        // producer is faster than consumer here
        Thread.sleep(20);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

}

public class ProducerConsumerDemo {

  public static void main(String[] args) {

    int numOfConsumers = 5;
    BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);

    for(int i=0; i<numOfConsumers; i++) {
      new SoupConsumer(blockingQueue).start();
    }
    new SoupProducer(blockingQueue, 5).start();

    System.out.println("Producer Consumer Completed");
  }
}
