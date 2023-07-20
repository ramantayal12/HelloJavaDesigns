package JacksonAnnotations.SerialisationUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;

public class SerializationUtil {

  private static ObjectMapper objectMapper;

  public void init(ObjectMapper mapper){
    objectMapper = mapper;
  }
  public SerializationUtil(){
  }

  public static ObjectMapper mapper(){
    Preconditions.checkNotNull(objectMapper, "Please call SerialisationUtil.init(mapper) to set mapper");
    return objectMapper;
  }

  public static String serialize(Object object) throws JsonProcessingException {
    return mapper().writeValueAsString(object);
  }

  /**
   *
   * 1. For converting json string to class type use readValue
   * 2. For converting object type to class type use convertValue
   *
   */
  public static <T> T deserialize(String value, Class<T> referenceClass)
      throws JsonProcessingException {
    return mapper().readValue(value, referenceClass);
  }

  public static <T> T deserializeObject(Object value, Class<T> referenceClass){
    return mapper().convertValue(value, referenceClass);
  }

}
