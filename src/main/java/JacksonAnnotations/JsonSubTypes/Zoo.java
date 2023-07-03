package JacksonAnnotations.JsonSubTypes;

import JacksonAnnotations.JsonSubTypes.Animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Zoo {

  public Animal animal;

}

