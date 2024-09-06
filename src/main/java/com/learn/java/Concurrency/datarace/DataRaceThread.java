package com.learn.java.Concurrency.datarace;


public class DataRaceThread extends Thread{

  public static int cntr = 0;

  @Override
  public void run() {
    for(int i=0; i<10000; i++) cntr++;
  }

}
