package com.learn.java.CoreJava.JavaInterface.JavaInterface;

// Interface is blueprint of class

/**
 * The Printable interface serves as a blueprint for classes implementing it. It contains a static
 * constant id and an abstract method print().
 * <p>
 * The interface also includes default methods getUserName() and getUserId() that provide default
 * implementations.
 */
interface Printable {

  String id = "ID"; // Static constant declaration

  void print(); // Abstract method declaration

  // Default methods in an interface
  default String getUserName() {
    return "default Name";
  }

  default String getUserId() {
    return this.id;
  }
}
