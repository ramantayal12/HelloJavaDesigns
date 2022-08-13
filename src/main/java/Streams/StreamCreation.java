package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

  public static void main(String args[]){

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
        .add("a")
        .add("b")
        .add("c")
        .build();

    // Method 5 of declaration
    Stream<String> streamGenerated =
        Stream.generate(() -> "element").limit(10);

    // Method 6 of declaration
    Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
    streamIterated.forEach(s -> System.out.println(s));

  }

}
