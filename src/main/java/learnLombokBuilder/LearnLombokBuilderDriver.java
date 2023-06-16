package learnLombokBuilder;

public class LearnLombokBuilderDriver {

  public static void main(String[] args ){

    BuilderAnnotationSample builderAnnotationSample = BuilderAnnotationSample.builder()
        .additionalName("Rishu")
        .familyName(" Tayal ")
        .givenName(" Raman ")
        .sport("Table Tennis ")
        .sport(" Badminton ")
        .build();

    System.out.println(builderAnnotationSample.getAdditionalName());
    builderAnnotationSample.setAge(12);
    builderAnnotationSample.setGivenName("Raman2");


    DataAnnotationSample dataAnnotationSample = new DataAnnotationSample ();
    dataAnnotationSample.setSender("MySelf");
    dataAnnotationSample.setMessageLength(10);
    dataAnnotationSample.setIsImportant(true);

  }

}
