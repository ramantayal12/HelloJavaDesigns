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
@JsonTypeName("cat")
public class Cat extends Animal {

  public String catName;
  public String catType;

  // these properties need to be public for Jackson to process them
  // or at least one method where these can be accessed like through
  // getters or setters.

}
