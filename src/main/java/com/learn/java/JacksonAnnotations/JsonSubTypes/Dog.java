package com.learn.java.JacksonAnnotations.JsonSubTypes;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonTypeName("dog")
public class Dog extends Animal {

  private String dogType;
  private String dogName;

  @Builder
  public Dog(String dogType, String dogName) {
    this.dogType = dogType;
    this.dogName = dogName;
  }
}
