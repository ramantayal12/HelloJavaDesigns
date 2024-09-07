package com.learn.java.design.patterns.observer;

public class ObserverPatternDriver {

  public static void main(String[] args) {

    Subject subject = new MathsSubject();

    Observer observer1 = new BinaryObserver(subject);
    Observer observer2 = new HexaObserver(subject);

    subject.changeState(15);
  }
}
