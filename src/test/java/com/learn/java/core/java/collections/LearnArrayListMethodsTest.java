package com.learn.java.core.java.collections;

import com.learn.java.collections.LearnArrayListMethods;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LearnArrayListMethodsTest {

  LearnArrayListMethods learnArrayListMethods;

  @BeforeEach
  void setUp() {
    learnArrayListMethods = new LearnArrayListMethods();
  }

  @Test
  public void testArrayList(){
    learnArrayListMethods.manipulatingArrayList(new ArrayList<>());
  }

}