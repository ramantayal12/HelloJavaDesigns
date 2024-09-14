package com.learn.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * used as object in LearnHashMaps class
 */
class Product {

  private String name;
  private String description;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Product(String name, String description) {
    this.name = name;
    this.description = description;
  }
}

public class LearnHashMaps {

  private final Map<String, String> productMap;

  /*
   * ConcurrentHashMap is a thread-safe implementation of the Map interface in Java, which means multiple threads can access it simultaneously without any synchronization issues.
   * One of the key features of the ConcurrentHashMap is that it provides fine-grained locking, meaning that it locks only the portion of the map being modified, rather than the entire map. This makes it highly scalable and efficient for concurrent operations.
   */
  private final ConcurrentHashMap<String, Integer> concurrentHashMap;

  public LearnHashMaps() {
    this.productMap = new HashMap<>();
    this.concurrentHashMap = new ConcurrentHashMap<>();
  }

  public void putMethod() {

    Product eBike = new Product("EBike", "A bike with a battery");
    Product computer = new Product("Computer",
        "Programmed to carry out sequences of arithmetic/logical operations");
    Product mobilePhone = new Product("SmartPhone",
        "A cell phone that has functions like that of a computer");

    this.productMap.put(eBike.getName(), eBike.getDescription());
    this.productMap.put(computer.getName(), computer.getDescription());

    // 1. HashMap also allows us to have null as a key
    this.productMap.put(null, "At least buy chocolate");

    // 2. putIfAbsent Method : we can add a new mapping, but only if there is not yet a mapping for the given key
    this.productMap.putIfAbsent(mobilePhone.getName(), mobilePhone.getDescription());

  }

  public void getMethod() {

    String eBikeDescription = this.productMap.get("EBike");
    System.out.println(eBikeDescription);

    // 1. If we try to find a value for a key that doesn't exist in the map, we'll get a null value
    String carDescription = this.productMap.get("car");
    System.out.println("No Value for key 'car' : " + carDescription);

    // 2. To check if a key is present in the map, we can use the containsKey() method
    System.out.println(this.productMap.containsKey("bike"));
    System.out.println(this.productMap.containsKey("EBike"));

    // 3. Using the getOrDefault() method, we can get a value from the map or return a default element in case there is no mapping for the given key:
    System.out.println(this.productMap.getOrDefault("bike", "key not available"));
    System.out.println(this.productMap.getOrDefault("EBike", "key not available"));

  }

  public void iterateMethod() {

    System.out.println("Iterate Method");
    for (String key : this.productMap.keySet()) {
      String description = this.productMap.get(key);
      System.out.println("key is : " + key + ", Value is : " + description);
    }

  }

  public void forEachMethod() {

    System.out.println("forEachMethod for iteration");
    this.productMap.forEach((key, value) -> {
      System.out.println("key is : " + key + ", Value is : " + this.productMap.get(key));
    });

  }
}
