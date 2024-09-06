package com.learn.java.JacksonAnnotations.JsonSubTypes;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Zoo {

  public Animal animal;

  /**
   * defining builder over constructor is helful in case of inheritance
   */
  @Builder
  public Zoo(Animal animal) {
    this.animal = animal;
  }
}

