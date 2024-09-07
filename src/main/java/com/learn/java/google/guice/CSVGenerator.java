package com.learn.java.google.guice;

public class CSVGenerator implements ReportGenerator {

  @Override
  public String generate() {
    return "CSV Report";
  }

}
