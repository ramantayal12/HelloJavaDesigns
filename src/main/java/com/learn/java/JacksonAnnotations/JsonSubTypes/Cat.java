package com.learn.java.JacksonAnnotations.JsonSubTypes;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonTypeName("cat")
public class Cat extends Animal {

  /**
   * these properties need to be public for Jackson to process them or at least one method where
   * these can be accessed like through getters or setters.
   */
  private String catName;
  private String catType;

  /**
   * defining builder over constructor is helful in case of inheritance
   */
  @Builder
  public Cat(String catName, String catType) {
    this.catName = catName;
    this.catType = catType;
  }
}
