package com.learn.java.concurrency.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

class DishProducer extends Thread{

  private final Queue<String> dataStream;
  private final Semaphore prodSema;
  private final Semaphore conSema;
  private final Semaphore mutex;

  public DishProducer(String name, Queue<String> dataStream, Semaphore prodSema, Semaphore conSema,
      Semaphore mutex) {
    super(name);
    this.dataStream = dataStream;
    this.prodSema = prodSema;
    this.conSema = conSema;
    this.mutex = mutex;
  }

  public DishProducer(
      Queue<String> dataStream,
      Semaphore prodSema,
      Semaphore conSema,
      Semaphore mutex) {
    this.dataStream = dataStream;
    this.prodSema = prodSema;
    this.conSema = conSema;
    this.mutex = mutex;
  }

  @Override
  public void run(){

    for(int i=0; i<20000; i++){

      try {
        prodSema.acquire();
        mutex.acquire();

        System.out.println("Producing Dish : " + i);
        dataStream.add("dish : " + i);

        mutex.release();
        conSema.release();
      }catch (Exception e){
        e.printStackTrace();
      }
    }

    for(int i=0; i<500; i++){
      try {
        prodSema.acquire();
        mutex.acquire();

        dataStream.add("no dish");

        mutex.release();
        conSema.release();
      }catch (Exception e){
        e.printStackTrace();
      }
    }

  }
}

class DishConsumer extends Thread{

  private final Queue<String> dataStream;
  private final Semaphore prodSema;
  private final Semaphore conSema;
  private final Semaphore mutex;

  public DishConsumer(String name, Queue<String> dataStream, Semaphore prodSema, Semaphore conSema,
      Semaphore mutex) {
    super(name);
    this.dataStream = dataStream;
    this.prodSema = prodSema;
    this.conSema = conSema;
    this.mutex = mutex;
  }

  public DishConsumer(
      Queue<String> dataStream,
      Semaphore prodSema,
      Semaphore conSema,
      Semaphore mutex) {
    this.dataStream = dataStream;
    this.prodSema = prodSema;
    this.conSema = conSema;
    this.mutex = mutex;
  }

  @Override
  public void run(){

    while( true ){

      try{

        conSema.acquire();
        mutex.acquire();

        String poll = dataStream.poll();
        if( poll.equals("no dish")) break;

        System.out.println("Dish : " + poll + " Consumed By  " + this.getName());

        mutex.release();
        prodSema.release();

      }catch (Exception e){
        e.printStackTrace();
      }
    }

  }
}

public class ProducerConsumerUsingSemaphore {

  public static void main(String[] args){

    Queue<String> dataStream = new LinkedList<>();
    Semaphore prodSema = new Semaphore(5);
    Semaphore conSema = new Semaphore(0);
    Semaphore mutex = new Semaphore(1);



    int numberOfConsumers = 500; // Number of consumer threads
    for (int i = 0; i < numberOfConsumers; i++) {
      new DishConsumer("thread " + i, dataStream, prodSema, conSema, mutex).start();
    }

    new DishProducer(dataStream, prodSema, conSema, mutex).start();

  }
}
