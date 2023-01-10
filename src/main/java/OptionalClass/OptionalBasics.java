package OptionalClass;

import java.util.Optional;

public class OptionalBasics {

  public static void comparingTwoStringsUsingOptional(String s1, String s2 ){

    Boolean doesMatch = Optional.ofNullable(s1)
        .map(match -> match.equals(s2))
        .orElse(false);

    System.out.println(doesMatch);
  }

}
