import java.util.Optional;

public class SampleDriver {

  public static void main(String args[]){

    String userId = "18105075";
    System.out.println(Optional.of(userId).map(String :: valueOf).orElse("Null"));
  }

}
