package Streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamCreation {

  public static Stream CreateStreams(){

    // Method 1 of declaration
    // Empty Stream
    Stream<String> streamEmpty = Stream.empty();

    // Method 2 of declaration
    // Stream of Array
    String[]  srr = new String[]{"abc","123"};
    Stream<String> streamOfArray = Arrays.stream(srr);

    Stream<String> streamOfArray2 = Stream.of("abc","123");

    // Method 3 of declaration
    // Stream of Collection
    Collection<String> collection = Arrays.asList("a","b","c");
    Stream<String> streamOfCollection = collection.stream();

    // Method 4 of declaration
    // Stream builder
    Stream<String> streamBuilder = Stream.<String>builder()
            .add("d")
            .add("b")
            .add("c")
            .add("a")
            .build();

    // Method 5 of declaration
    Stream<String> streamGenerated =
            Stream.generate(() -> "element").limit(10);

    // Method 6 of declaration
    Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
    //streamIterated.forEach(s -> System.out.println(s));

    return streamBuilder;

  }

  public static void ManipulatingStreams(){

    Stream<String> stream =
            Stream.of("a", "b", "c","bd").filter(element -> element.contains("b"));

    Optional<String> anyElement = stream.findAny();
    Optional<String> firstElement = stream.findFirst();
    System.out.println (anyElement);
    System.out.println (firstElement);

  }

  public static long StreamPipeline(Stream streamSample){

    return streamSample.sorted ().count ();

  }

  public static void main(String args[]){

    System.out.println (StreamPipeline (CreateStreams()));

  }

}
