package EnumClass;

import lombok.Data;

public enum DaysOfWeek {
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
  DaysOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }
}
