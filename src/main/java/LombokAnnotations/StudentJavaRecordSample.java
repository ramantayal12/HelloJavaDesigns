package LombokAnnotations;

/**
 * Another way of implementing same thing is using record
 * Basically for records we don't get setters
 */

/*
  a constructor is created for this automatically
  Person person = new Person("John Doe", "100 Linda Ln.");
 */

/*
  getters are also created by default for public variables'
  person.name()
 */
record StudentJavaRecordSample(String name, String address) {
}
