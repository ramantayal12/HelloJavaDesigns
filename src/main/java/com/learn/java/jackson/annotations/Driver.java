package com.learn.java.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.java.jackson.annotations.json.sub.types.Zoo;

/**
 * UseCase: Suppose you are getting an object something like: { "animal": { "dog":{ "barVolume" :
 * 100 } } } or { "animal":{ "cat":{ "likesCream" : true, "lives": 10 } } }
 * <p>
 * The better way is to have a common object that will serialize into separate objects instead of us
 * checking which class it is referring to.
 */
public class Driver {

  public static void main(String[] args) throws JsonProcessingException {

    ObjectMapper objectMapper = new ObjectMapper();

    String catDeserialize = "{\"animal\":{\"name\":\"cat\",\"catName\":\"lacy\",\"catType\":\"lazy\"}}";
    String dogDeserialize = "{\"animal\":{\"name\":\"dog\",\"dogType\":\"labrador\",\"dogName\":\"mack\"}}";
    Zoo deserializedZoo = objectMapper.readerFor(Zoo.class).readValue(catDeserialize);
    Zoo deserializedDog = objectMapper.readerFor(Zoo.class).readValue(dogDeserialize);
    System.out.println(deserializedZoo);
    System.out.println(deserializedDog);

  }

}
