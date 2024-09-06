package com.learn.java.LombokAnnotations;

import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;


@Getter
@Setter
@Data // combination of @Getter & @Setter
@Builder
public class BuilderAnnotationSample {

  @Setter(AccessLevel.PROTECTED)
  private String givenName;
  private String additionalName;
  private String familyName;
  private int age;
  @Singular("sport")
  private List<String> sportsPlayed;
}
