package JacksonAnnotations.JsonSubTypes;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonTypeName("dog")
public class Dog extends Animal {

  public String dogType;
  String dogName;

}
