package learnLombokBuilder;


import lombok.Value;

/**
 * Suppose we're using an object that we want to construct with a builder,
 * but we can't modify the source or extend the Class.
 */

@Value
class ImmutableBuilder {
  int id;
  String name;
}

/**
 * Another way of implementing same thing is using record
 * Basically for records we don't get setters
 */
record Student(String name, String address){}

/*
  a constructor is created for this automatically
  Person person = new Person("John Doe", "100 Linda Ln.");
 */

/*
  getters are also created by default for public variables'
  person.name()
 */
