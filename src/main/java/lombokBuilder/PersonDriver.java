package lombokBuilder;

public class PersonDriver {

  public static void main(String[] args ){

    Person person = Person.builder()
        .additionalName("Rishu")
        .familyName(" Tayal ")
        .givenName(" Raman ")
        .sport("Table Tennis ")
        .sport(" Badminton ")
        .build();

    System.out.println(person.getAdditionalName());
    person.setAge(12);
    person.setGivenName("Raman2");

  }

}
