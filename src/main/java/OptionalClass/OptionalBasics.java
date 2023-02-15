package OptionalClass;

import java.util.Optional;

public class OptionalBasics {

  public static void usingMethodsInsideClassUsingOptional(String words){

    System.out.println(Optional.ofNullable(words)
        .map(String::toLowerCase)
        .orElse(null));

    /**
     * isEmpty returns false so .orElse will be executed
     */
    System.out.println(Optional.ofNullable(words)
        .filter(String::isEmpty)
        .map(String::toLowerCase)
        .orElse(null));

  }
  public static void comparingTwoStringsUsingOptional(String s1, String s2 ){

    Boolean doesMatch = Optional.ofNullable(s1)
        .map(match -> match.equals(s2))
        .orElse(false);

    System.out.println(doesMatch);
  }

}
