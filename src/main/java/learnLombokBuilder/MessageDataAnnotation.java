package learnLombokBuilder;

import lombok.Data;

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
