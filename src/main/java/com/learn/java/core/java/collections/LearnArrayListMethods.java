package com.learn.java.core.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LearnArrayListMethods {

  public ArrayList<Integer> initializeMethods() {

    List<Integer> arrayList = new ArrayList<>();
    List<Integer> arrayList1 = new ArrayList<>(10);

    List<Integer> arrayList2 = IntStream.range(0, 10)
        .boxed()
        .collect(Collectors.toList());

    return (ArrayList<Integer>) arrayList2;

  }

  public void manipulatingArrayList(ArrayList<Integer> arrayList) {

    // Adding elements
    arrayList.add(20);
    arrayList.add(24);

    // Removing elements using index
    arrayList.remove(0);

    // manipulation using collection framework
    Collections.reverse(arrayList);

    // Iterating in arrayList using lambda
    arrayList.forEach((element) -> {
      System.out.print(element);
      element += 2;
      System.out.println(element);
    });

  }
}
