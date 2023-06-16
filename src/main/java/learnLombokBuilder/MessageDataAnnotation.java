package learnLombokBuilder;

import lombok.Data;

/**
 * The @Data annotation from Lombok library generates getter, setter, toString, equals, and hashCode methods
 * for all fields in the class automatically.
 * It reduces boilerplate code and improves code readability.
 * The generated methods ensure encapsulation and provide easy access to the class properties.
 */
@Data
class Message{

  private String sender;
  private int messageLength;
  private Boolean isImportant;

}


public class MessageDataAnnotation {

  public static void main(String[] args ){

    Message message = new Message();
    message.setSender("MySelf");
    message.setMessageLength(10);
    message.setIsImportant(true);

  }

}
