package EnumClass;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class IteratingOverEnum {

  public static void iterationOverEnum(){

    /*
     * Method 1 : using advanced for loop
     */
    System.out.println("using advanced for loop for iterating over enum class");
    for( DaysOfWeek day : DaysOfWeek.values() ){
      System.out.println(day);
    }

    /*
     * Method 2 : using streams
     */
    System.out.println("using stream for iterating over enum class");

    Stream.of(DaysOfWeek.values())
        .filter( dayOfWeek -> dayOfWeek.getDayOfWeek().equals("off"))
        .forEach(System.out::println);

    /*
     * Method 3 :  Iterate Using forEach()
     */

    Stream.of(DaysOfWeek.values())
        .forEach(System.out::println);

    Stream.of(DaysOfWeek.values())
        .forEach(dayOfWeek -> System.out.println(dayOfWeek.getDayOfWeek()));

    System.out.println("Sample Test");
    System.out.println(DaysOfWeek.valueOf("Monday"));
  }

}
