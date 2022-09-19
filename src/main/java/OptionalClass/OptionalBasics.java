package OptionalClass;

import java.util.Optional;

public class OptionalBasics {

  public static void optionalDemo() {

    String[] words = new String[10];
    words[0] = "Raman";

    Optional<String> checkNull1 = Optional.ofNullable(words[0]);
    System.out.println(checkNull1);

    Optional<String> checkNull2 = Optional.ofNullable(words[1]);
    System.out.println(checkNull2);

  }

}
