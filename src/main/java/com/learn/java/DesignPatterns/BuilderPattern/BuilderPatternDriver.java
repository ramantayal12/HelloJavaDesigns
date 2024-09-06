package com.learn.java.DesignPatterns.BuilderPattern;

import com.learn.java.DesignPatterns.BuilderPattern.BankAccount.BankAccountBuilder;

public class BuilderPatternDriver {

  public static void main(String[] args) {

    BankAccount bankAccount = new BankAccountBuilder()
        .setAirbags(true)
        .setPrice(200)
        .setName("BuilderPattern.car")
        .build();
  }
}
