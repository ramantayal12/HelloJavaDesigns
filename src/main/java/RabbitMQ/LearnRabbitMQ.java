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

  public static void Consumer( Channel channel ) throws IOException {

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
      }
    };
    channel.basicConsume("products_queue", true, consumer);

  }

  public static void Producer( Connection connection, Channel channel ) throws IOException, TimeoutException {

    channel.queueDeclare("products_queue", false, false, false, null);
    String message = "product details";
    channel.basicPublish("", "products_queue", null, message.getBytes());

    channel.close();
    connection.close();

  }

  public static void main( String args[] ) throws IOException, TimeoutException {

    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");

    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();

    factory.setPort(15678);
    factory.setUsername("user1");
    factory.setPassword("MyPassword");

    Producer(connection,channel);
    Consumer(channel);

  }

}
