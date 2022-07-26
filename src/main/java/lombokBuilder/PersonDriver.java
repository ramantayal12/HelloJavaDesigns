package lombokBuilder;

public class PersonDriver {

  public static void main(String[] args ){

    Person person = Person.builder()
        .additionalName("Rishu")
        .familyName("Tayal")
        .givenName("Raman")
        .build();

    System.out.println(person);
  }

}
