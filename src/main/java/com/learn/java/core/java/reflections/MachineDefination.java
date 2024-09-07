package com.learn.java.core.java.reflections;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Specifies that this annotation can be applied to types (classes, interfaces, enums)
@Target({ElementType.TYPE})

// Specifies that this annotation will be retained at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface MachineDefination {

  // Specifies a required element for the annotation, which is a string called "name"
  String name();

}
