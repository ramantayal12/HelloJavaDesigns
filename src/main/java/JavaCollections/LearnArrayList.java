package JavaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LearnArrayList {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    ArrayList<Integer> arrayList = new ArrayList<Integer>(n);

    for(int i=0; i<n; i++){
      int x = scanner.nextInt();
      arrayList.add(x);
    }

    for(int i=0; i<n; i++){
      System.out.print(arrayList.get(i) + " ");
    }
    System.out.println();

    for(int i=0; i<n; i++){
      arrayList.set(i, arrayList.get(i) + 2);
    }

    for(int i=0; i<n; i++){
      System.out.print(arrayList.get(i) + " ");
    }

    // Printing Size of List

    System.out.println("Size of List");
    System.out.println(arrayList.size());

    // Sorting list

    Collections.sort(arrayList);

  }

}
