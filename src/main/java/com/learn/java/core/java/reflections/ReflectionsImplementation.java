package com.learn.java.core.java.reflections;


import java.util.Arrays;
import org.reflections.Reflections;

public class ReflectionsImplementation {

  // Define the package name to be used in reflections
  public static final String PACKAGE_NAMES = "com/learn/java/core/java/reflections";

  public static void getReflections() {

    // Create a new instance of the Reflections class with the specified package name
    Reflections reflections = new Reflections(PACKAGE_NAMES);

    // Get all classes that are annotated with MachineDefination
    var annotatedClasses = reflections
        .getTypesAnnotatedWith(MachineDefination.class);

    System.out.println(Arrays.toString(annotatedClasses.toArray()));

  }
}
