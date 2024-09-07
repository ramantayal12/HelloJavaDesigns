package com.learn.java.design.patterns.builder;

import com.learn.java.design.patterns.builder.BankAccount.BankAccountBuilder;

public class BuilderPatternDriver {

  public static void main(String[] args) {

    BankAccount bankAccount = new BankAccountBuilder()
        .setAirbags(true)
        .setPrice(200)
        .setName("BuilderPattern.car")
        .build();
  }
}
