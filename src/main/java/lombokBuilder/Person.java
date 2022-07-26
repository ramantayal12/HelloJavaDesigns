package lombokBuilder;

import java.util.List;
import lombok.Builder;


@Builder
public class Person {
  private final String givenName;
  private final String additionalName;
  private final String familyName;
  private final List<String> tags;
}
