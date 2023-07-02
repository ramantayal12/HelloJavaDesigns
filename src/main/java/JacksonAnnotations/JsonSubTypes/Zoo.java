package JacksonAnnotations.JsonSubTypes;

import JacksonAnnotations.JsonSubTypes.Animal;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
public class Zoo {

  public Animal animal;

}

