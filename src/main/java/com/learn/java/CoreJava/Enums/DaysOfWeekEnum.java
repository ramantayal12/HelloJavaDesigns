package com.learn.java.CoreJava.Enums;

public enum DaysOfWeekEnum {
  SUNDAY("off"),
  MONDAY("working"),
  TUESDAY("working"),
  WEDNESDAY("working"),
  THURSDAY("working"),
  FRIDAY("working"),
  SATURDAY("off");

  public String getDayOfWeek() {
    return dayOfWeek;
  }

  private String dayOfWeek;

  DaysOfWeekEnum(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }
}