package com.learn.java.core.java.enums;

import java.util.stream.Stream;

public class IteratingEnums {

  private DaysOfWeekEnum daysOfWeekEnum;

  /**
   * This method demonstrates different ways to iterate over an enum class. It prints the values of
   * the DaysOfWeekEnum using different iteration methods.
   */
  public static void iterationOverEnum() {

    /*
     * Method 1 : Using advanced for loop
     */
    System.out.println("using advanced for loop for iterating over enum class");
    for (DaysOfWeekEnum day : DaysOfWeekEnum.values()) {
      System.out.println(day);
    }

    /*
     * Method 2 : Using streams
     * In this example, it filters and prints the days that have the value "off".
     */
    System.out.println("using stream for iterating over enum class");

    Stream.of(DaysOfWeekEnum.values())
        .filter(dayOfWeek -> dayOfWeek.getDayOfWeek().equals("off"))
        .forEach(System.out::println);

    /*
     * Method 3 :  Iterate Using forEach()
     */

    Stream.of(DaysOfWeekEnum.values())
        .forEach(System.out::println);

    Stream.of(DaysOfWeekEnum.values())
        .forEach(dayOfWeek -> System.out.println(dayOfWeek.getDayOfWeek()));

    System.out.println("Sample Test");
    System.out.println(DaysOfWeekEnum.valueOf("Monday"));
  }


  /**
   * This method returns the current day of the week.
   *
   * @return The current day of the week as a DaysOfWeekEnum value.
   */
  public DaysOfWeekEnum getCurrentDay() {
    return this.daysOfWeekEnum;
  }


  /**
   * This method sets the current day of the week.
   *
   * @param daysOfWeekEnum The DaysOfWeekEnum value to set as the current day.
   */
  public void setDaysOfWeekEnum(DaysOfWeekEnum daysOfWeekEnum) {
    this.daysOfWeekEnum = daysOfWeekEnum;
  }

}
