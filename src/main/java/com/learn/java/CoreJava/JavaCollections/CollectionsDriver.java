package com.learn.java.CoreJava.JavaCollections;

import java.util.ArrayList;

public class CollectionsDriver {

  public static void main(String args[]) {

    // hashMaps
    System.out.println("hashMaps");
    LearnHashMaps hashMapsBasics = new LearnHashMaps();
    hashMapsBasics.putMethod();
    hashMapsBasics.getMethod();
    hashMapsBasics.iterateMethod();
    hashMapsBasics.forEachMethod();

    // ArrayList
    System.out.println("ArrayList");
    LearnArrayListMethods learnArrayListMethods = new LearnArrayListMethods();
    ArrayList<Integer> arrayList = learnArrayListMethods.initializeMethods();
    learnArrayListMethods.manipulatingArrayList(arrayList);

  }
}
