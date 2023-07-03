package JacksonAnnotations.JsonSubTypes;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("dog")
public class Dog extends Animal {

  private String dogType;
  private String dogName;

}
