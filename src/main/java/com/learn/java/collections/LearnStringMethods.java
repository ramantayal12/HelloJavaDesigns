package com.learn.java.collections;

import java.util.StringJoiner;

public class LearnStringMethods {

  public static String learnStringJoiner(String s1, String s2) {

    return new StringJoiner(" . ")
        .add(s1)
        .add(s2)
        .toString();
  }

  public static String helloStringFormat(String s1, String s2) {

    return String.format("Hello String %s, Hello Again %s", s1, s2);
  }

}
