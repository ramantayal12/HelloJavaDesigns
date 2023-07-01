package RabbitMQ;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class LearnRabbitMQ {

  // Consumer method to receive messages from the queue
  public static void Consumer(Channel channel) throws IOException {

    channel.queueDeclare("products_queue", false, false, false, null);

    DefaultConsumer consumer = new DefaultConsumer(channel) {
      @Override
      public void handleDelivery(
              String consumerTag,
              Envelope envelope,
              AMQP.BasicProperties properties,
              byte[] body) throws IOException {

        String message = new String(body, "UTF-8");
        // process the message
        // Add your code here to process the received message
        System.out.println (message);
      }
    };
    channel.basicConsume("products_queue", true, consumer);

  }

  // Producer method to send messages to the queue
  public static void Producer(Connection connection, Channel channel) throws IOException, TimeoutException {

    channel.queueDeclare("products_queue", false, false, false, null);
    String message = "product details";
    channel.basicPublish("", "products_queue", null, message.getBytes());

    channel.close();
    connection.close();

  }

  public static void main(String args[]) throws IOException, TimeoutException {

    // Create a new connection factory
    ConnectionFactory factory = new ConnectionFactory();

    // Set the RabbitMQ server host
    factory.setHost("localhost");

    // Set the RabbitMQ server port
    factory.setPort(15678);

    // Set the username and password for authentication
    factory.setUsername("user1");
    factory.setPassword("MyPassword");

    // Create a new connection
    Connection connection = factory.newConnection();

    // Create a new channel
    Channel channel = connection.createChannel();

    // Call the Producer method to send a message
    Producer(connection, channel);

    // Call the Consumer method to receive messages
    Consumer(channel);

  }

}
