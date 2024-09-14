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
    arrayList.add(28);
    arrayList.add(20);
    arrayList.add(24);


    // Removing elements using index
    arrayList.remove(0);

    // manipulation using collection framework
    Collections.reverse(arrayList);

    // sorting an arrayList
    Collections.sort(arrayList);

    // iterating arrayList using for loop
    for(int i=0; i<arrayList.size(); i++){

      Integer x = arrayList.get(i);

      // change the element value at index i
      arrayList.set(i, x+2);

      System.out.println(arrayList.get(i));
    }

  }
}
