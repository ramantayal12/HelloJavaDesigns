package com.learn.java;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestEntityObject {

  private String id;
  private String description;

  @Builder
  public TestEntityObject(String id, String description) {
    this.id = id;
    this.description = description;
  }
}
