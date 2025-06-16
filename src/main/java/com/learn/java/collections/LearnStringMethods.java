package com.learn.java.collections;

import java.util.*;

public class LearnStringMethods {

  public static void getFamiliear(){

    String s = "/a/bc/def";
    ArrayList<Character> ar = new ArrayList<>();
    HashMap<List, String> mp = new HashMap<>();
    Stack<Character> st = new Stack<>();
    for(int i=0; i<s.length();i++){
      if( s.charAt(i) == '/'){
        ar = new ArrayList<>();
        mp.put(ar, "val");
        continue;
      }
      else{
        ar.add(s.charAt(i));
      }
    }

    System.out.println(mp);

  }

  public static void main(String[] args){
    getFamiliear();
  }

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
