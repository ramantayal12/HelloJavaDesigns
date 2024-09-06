package com.learn.java.GoogleGuice;

public class CSVGenerator implements ReportGenerator {

  @Override
  public String generate() {
    return "CSV Report";
  }

}
