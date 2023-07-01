package LombokAnnotations;

import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Builder;
import lombok.Setter;
import lombok.Singular;


@Getter
@Setter
@Builder
public class BuilderAnnotationSample {
  @Setter(AccessLevel.PROTECTED) private String givenName;
  private String additionalName;
  private String familyName;
  private int age;
  @Singular("sport")  private List<String> sportsPlayed;
}
