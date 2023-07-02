package JacksonAnnotations;

import JacksonAnnotations.JsonSubTypes.Cat;
import JacksonAnnotations.JsonSubTypes.Dog;
import JacksonAnnotations.JsonSubTypes.Zoo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * UseCase: Suppose you are getting an object something like:
 * {
 *   "animal": {
 *    "dog":{
 *      "barVolume" : 100
 *      }
 *    }
 *  }
 *  or
 *  {
 *   "animal":{
 *     "cat":{
 *       "likesCream" : true,
 *       "lives": 10
 *     }
 *   }
 * }
 *
 * The better way is to have a common object that will serialize
 * into separate objects instead of us checking which class it is referring to.
 */
public class Driver {

  public static void main(String[] args ) throws JsonProcessingException {

    Dog dog = Dog.builder()
        .dogType("labrador")
        .dogName("mack")
        .build();
    Zoo zoo = Zoo.builder()
        .animal(dog)
        .build();

    System.out.println(new ObjectMapper().writeValueAsString(zoo));

    Cat cat = Cat.builder()
        .catName("lacy")
        .catType("lazy")
        .build();
    Zoo zoo1 = Zoo.builder()
        .animal(cat)
        .build();

    System.out.println(new ObjectMapper().writeValueAsString(zoo1));
  }

}
